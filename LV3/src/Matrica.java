import java.util.Scanner;

public class Matrica {
    
    Scanner input = new Scanner(System.in);
    int m,n,i,j;
    
    public int[][] izradiMatricu(){ //metoda koja ce kreirati 2d matricu
        
        int[][] matrica = new int[5][5];
        System.out.println("\nUnesite velicinu kvadratne matrice (1-5)");
        
        do{
            
            try{
                
                m=input.nextInt();
                
            }catch(Exception greskaM){
               System.out.println("\nDogodila se pogreska kod matrice!");
            }
            if(m<1||m>5)
                System.out.println("\nPogresno unesena vrijednost, unesite ponovno! (1-5)");
            
            
        }while(m<1||m>5);
        
        System.out.println("\nUnos elemenata u matricu.");
        System.out.println("\nMatrica: \n");
        
        for(i=0;i<m;i++){ //unos elemenata u 2d matricu i ispis matrice
            for(j=0;j<m;j++){
                
                matrica[i][j]=(int)(Math.random()*10);
                System.out.print(matrica[i][j] + " ");
                
            }
           System.out.println();
        }
        
        return matrica;
    }
    
    public int[] izradiVektor(){ //metoda koja ce izraditi 1d polje
        
        int[] vektor = new int[10];
        System.out.println("\nUnesite velicinu vektora (2-10)");
        
        do{
            
            try{
                
                n=input.nextInt();
                
            }catch(Exception greskaV){
                System.out.println("\nDogodila se pogreska kod vektora!");
            }
            
            if(n<2||n>10)
                System.out.println("\nPogresno unesena velicina, unesite ponovno! (2-10)");
                
        }while(n<2||n>10);
        
        System.out.println("\nUnesite elemente vektora: ");
        
        for(i=0;i<n;i++) //unos elemenata u vektor
            vektor[i]=input.nextInt();
        
        return vektor;
    }
    
    public void arts(int[][] matrica){ //metoda koja racuna aritmeticku sredinu sporedne dijagonale 2d matrice
        
        double suma=0;
        int pBr=0;
        
        for(i=0;i<m;i++){ 
            for(j=0;j<m;j++){
                if((i+j)==(m-1)){ //trazim elemente sporedne dijagonale 2d matrice i zbrajam ih u sumu
                    suma += matrica[i][j];
                    pBr++;
                }
            }
        }
        
        suma /= pBr;
        System.out.println("\nAritmeticka sredina sporedne dijagonale matrice je: " + suma);
        
    }
    
    public void sumaNeparnihBr(int[][] matrica){ //metoda koja zbraja neparne elemente 1.stupca i 1. retka 2d matrice
        
        int suma=0;
        boolean pVr=false;
        
        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(i==0||j==0){
                    if(matrica[i][j] % 2 != 0){
                        suma += matrica[i][j];
                        pVr=true; //ukoliko postoji barem jedan neparni broj u 1. retku ili 1. stupcu matrice pVr ce biti true
                    }
                }
            }
        }
        
        if(pVr)
            System.out.println("\nSuma neparnih brojeva 1. retka i 1. stupca matrice je: " + suma);
        else
            System.out.println("\nNe postoji neparan broj u 1. retku ili 1. stupcu matrice!");
    }
    
    public void ispisParnihBr(int[] vektor){ //metoda koja ispisuje elemente vektora na parnim indeksima
        
        for(i=0;i<n;i++){
            if(i%2==0)
                System.out.print(vektor[i] + " ");
        }
    }
    
    public void izbornik(int[][] matrica, int[] vektor){
        
        int izbornik=0;
        
        do{
            
            System.out.println("\n\t-------------------------------------------------------------------------------------"
                             + "\n\n\t01. IZRACUNAJ ARITMETICKU SREDINU SPOREDNE DIJAGONALE MATRICE"
                             + "\n\n\t02. IZRACUNAJ SUMU NEPARNIH ELEMENATA PRVOG RETKA I PRVOG STUPCA MATRICE"
                             + "\n\n\t03. ISPISI SVE BROJEVE NA PARNIM INDEKSIMA VEKTORA"
                             + "\n\n\tEXIT -> PRITISNITE BILO KOJU TIPKU ZA IZLAZ IZ PROGRAMA"
                             + "\n\t-------------------------------------------------------------------------------------");
            
            izbornik=input.nextInt();
            switch(izbornik){
                case 1:
                    arts(matrica);
                    break;
                case 2:
                    sumaNeparnihBr(matrica);
                    break;
                case 3:
                    ispisParnihBr(vektor);
                    break;
                default:
                    System.out.println("\nZatvaranje programa!");
                    izbornik=4;
                    break;
            }
            
        }while(izbornik!=4);
    }
    
}
