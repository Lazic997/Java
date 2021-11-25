import java.io.File;

public class App {
    
    public static void main(String[] args){
        
        File imeDatoteke = new File("C:");
        analizirajPutanju(imeDatoteke);
        popraviImena(imeDatoteke);
        
    }
    
    public static void analizirajPutanju(File imeDatoteke){
        
        if(imeDatoteke.exists()){
            
            System.out.printf("%s %s\n%s\n%s\n%s\n%s %s\n%s %s\n%s %s\n%s %s",
                               imeDatoteke.getName(),"Datoteka postoji!",
                               (imeDatoteke.isFile() ? "Datoteka je!" : "Nije datoteka!"),
                               (imeDatoteke.isDirectory() ? "Direktorij je" : "Nije direktorij!"),
                               (imeDatoteke.isAbsolute() ? "Apsolutna putanja!" : "Nije apsolutna putanja!"),
                               "Zadnje modificirano: ", imeDatoteke.lastModified(),
                               "Duzina: ", imeDatoteke.length(),
                               "Putanja: ", imeDatoteke.getAbsolutePath(),
                               "Roditeljska datoteka: ", imeDatoteke.getParent());
            
            if(imeDatoteke.isDirectory()){
                
                File[] direktorij = imeDatoteke.listFiles(); //stvaram polje u koje spremam sve elemente direktorija
                System.out.println("\n\n\tDirektorij sistemskog diska sadrzi: \n");
                
                for(File index : direktorij){
                    
                    if(index.isFile())
                        System.out.println("Datoteka: " + index.getName());
                    else if(index.isDirectory())
                        System.out.println("Direktorij: " + index.getName());
                    
                }
            }
        }else{
            System.out.printf("%s %s", imeDatoteke , "Ne postoji!");
        }
    }
    
    public static void popraviImena(File imeDatoteke){
        
        File[] direktorij = imeDatoteke.listFiles();
        System.out.println("\n\tPopravljena imena sistemskog diska: \n");

        
        for(File index : direktorij){
            
            if(index.isFile()){
                if(index.getName().charAt(0) < 'a' && index.getName().charAt(0) <= 'n') { //ako je malo pocetno slovo a-n datoteke 
                    System.out.println("Datoteka: " + index.getName().substring(0,1).toUpperCase() + index.getName().substring(1)); //prepravljam u veliko pocetno slovo
                }else if(index.getName().charAt(0) >= 'o' && index.getName().charAt(0) <= 'z' || index.getName().charAt(0) >= 'O' && index.getName().charAt(0) <= 'Z'){ //ako je pocetno slovo o-z datoteke
                    String zadnjeSlovoImena = index.getName().substring(index.getName().length()-1); //izvlacim zadnje slovo imena datoteke
                    if(zadnjeSlovoImena.charAt(0) >= 'a' && zadnjeSlovoImena.charAt(0) <= 'z') //ako je zadnje slovo imena datoteke malo slovo
                        System.out.println("Datoteka: " + index.getName().toUpperCase()); //citav naziv datoteke pretravam u velika slova
                }else{
                    System.out.println("Datoteka: " + index.getName()); //ako nije nista od navedenog ispisi ime datoteke kakvo jeste
                }
            }else if(index.isDirectory()){
                if(index.getName().charAt(0) < 'a' && index.getName().charAt(0) <= 'n') { //ako je malo pocetno slovo a-n datoteke 
                    System.out.println("Direktorij: " + index.getName().substring(0,1).toUpperCase() + index.getName().substring(1)); //prepravljam u veliko pocetno slovo
                }else if(index.getName().charAt(0) >= 'o' && index.getName().charAt(0) <= 'z' || index.getName().charAt(0) >= 'O' && index.getName().charAt(0) <= 'Z'){ //ako je pocetno slovo o-z datoteke
                    String zadnjeSlovoImena = index.getName().substring(index.getName().length()-1); //izvlacim zadnje slovo imena datoteke
                    if(zadnjeSlovoImena.charAt(0) >= 'a' && zadnjeSlovoImena.charAt(0) <= 'z') //ako je zadnje slovo imena datoteke malo slovo
                        System.out.println("Direktorij: " + index.getName().toUpperCase()); //citav naziv datoteke pretravam u velika slova
                }else{
                    System.out.println("Direktorij: " + index.getName()); //ako nije nista od navedenog ispisi ime datoteke kakvo jeste
                }
            }
        }
    }
}
