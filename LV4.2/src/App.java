import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        List<Student> studenti = new ArrayList<>();
        double prosjekOcjena=0;
        int pBr = 0;
        
        for(int i = 0 ; i<3 ; i++){ //unos podataka u listu studenata (treba 10 ja sam stavio 3 za test)
            
            Student student = new Student();
            try{
                
                student.setMaticniBroj((int)(Math.random() * 9999 + 999)); //napravio sam da je u ovom slucaju maticni broj studenta random broj od 1000 do 9999
                System.out.println("\tUnesite ime "+ (i+1) +". studenta: ");
                student.setIme(scanner.next());
                System.out.println("\tUnesite prezime "+ (i+1) +". studenta: ");
                student.setPrezime(scanner.next());
                System.out.println("\tUnesite fakultet "+ (i+1) +". studenta: ");
                student.setFakultet(scanner.next());
                System.out.println("\tUnesite smijer "+ (i+1) +". studenta: ");
                student.setSmijer(scanner.next());
                student.setGodina((int)(Math.random() * 4 + 1)); //random godina izmedju 1 i 5
                student.setOcjena((double)(Math.random() * 4 + 1)); //random double ocjena izmedju 1 i 5

                studenti.add(student); //dodajem elente u listu
                
            }catch(Exception e){
                 System.out.println(e);
            }
        }
        
        //zapisivanje studenta u datoteku
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("studenti.ser"))) {
            
                for(Student index : studenti){
                    try{
                        out.writeObject(index);
                        System.out.println("Student sacuvan!");
                    }catch(IOException e){
                        System.out.println(e);
                    }
                }   
                
                studenti.removeAll(studenti); //kada upisem sve studente u datoteku zelim da mi lista studenata u programu bude prazna
                          
        }catch(Exception e){
            System.out.println(e);
        }
        
        //citanje studenata iz datoteke
        System.out.printf("\n\t-%10s%20s%20s%20s%15s%15s%15s","Maticni broj:","Ime:","Prezime:","Fakultet:","Smijer:","Godina:","Ocjena:");
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("studenti.ser"))){
            
            while(true){
                try{
                    
                    Student student = (Student)in.readObject(); //ucitavam objekt
                    prosjekOcjena += student.getOcjena(); //zbrajam sve ocjene studenata u varijablu prosjekOcjena
                    pBr++; //prebrojavam koliko studenata se ucitava jer nekada necu znati koliko studenata je u datoteci
                    
                    studenti.add(student);//dodajem studente nazad u lisu ako ju zelim koristiti kasnije
                    
                    System.out.println("\nStudent ocitan!");
                    System.out.printf("\n\t-%10d%20s%20s%20s%15s%15d%18f", student.getMaticniBroj(),student.getIme(), //ispis informacija ucitanog studenta
                                                                           student.getPrezime(),student.getFakultet(),
                                                                           student.getSmijer(),student.getGodina(),
                                                                           student.getOcjena());
                    
                }catch(IOException | ClassNotFoundException e){
                    break; //zaustavljam while petlju
                }
            }
            
          
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        prosjekOcjena /= pBr;
        System.out.println("\n\n\tProsjek ocjena svih studenata je: " + prosjekOcjena);
    }
}