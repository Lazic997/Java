
import java.util.Scanner;
import java.util.Random;


public class Matrica {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int m,n,i,j;

    public int[][] izradiMatricu(){
        
        int[][] matrica = new int[5][5];
        System.out.println("\nUnesite velicinu kvadratne matrice (m 1-5)");
        

        do{

            m=input.nextInt();

            if(m<1||m>5)
                System.out.println("\nPogresno unesena vrijednost, unesite ponovno!");
               
        }while(m<1||m>5);

        
        System.out.println("\nUnos elemenata matrice.");
        System.out.println("\nMatrica:\n");

        for(i = 0; i<m ; i++){ //unos elemenata u 2d matricu i ispis matrice
            for(j = 0; j<m ; j++){

                    matrica[i][j]=random.nextInt(10);
                    System.out.print(matrica[i][j] + " ");

                }
            System.out.println("\r");
        }
        
        return matrica;
    }

    public int[] izradiVektor (){

        int[] vektor = new int[10];
        System.out.println("\nUnesite velicinu vektora (n 2-10)");
        do{

            n=input.nextInt();

            if(n<2||n>10)
                System.out.println("\nPogresno unesena vrijednost, unesite ponovno!");
               
        }while(n<2||n>10);

        
        System.out.println("\nUnos elemenata vektora:");

        for(i = 0; i<n ; i++){
           
            vektor[i]=input.nextInt();
        }

        return vektor;
    }

    public void arts(int[][] matrica){ //metoda koja racuna aritmeticku sredine sporedne dijagonale 2d matrice

        double suma=0;
        int pBr=0;

        for(i=0;i<m;i++){ //trazim elemente sporedne dijagonale 2d matrice i zbrajam ih u sumu
            for(j=0;j<m;j++){
                if((i+j)==(m-1)){
                suma += matrica[i][j];
                pBr++;
                }
            }
        }

        suma /= pBr;
        System.out.println("\nAritmeticka sredina sporedne dijagonale matrice je: " + suma);
    }

    public void sumaNeparnihBr(int[][] matrica){ //metoda koja zbraja neparne elemente 1. stupca i 1. retka 2d matrice

        int suma=0;
        boolean pVr=false; //uvodim pomocnu varijablu kao proveru da li postoje neparni brojevi

        for(i=0;i<m;i++){
            for(j=0;j<m;j++){
                if(i==0||j==0){ //trazim elemente prvog retka(nultog) i prvog stupca 2d matrice
                    if(matrica[i][j] % 2 != 0){ //provera ako je element na i/j adresi neparan
                        suma += matrica[i][j];
                        pVr=true;//ako postoji barem jedan neparan broj u matrici varijabla ce biti true
                    }
                }
            }
        }

        if(pVr)
            System.out.println("\nSuma neparnih elemenata 1. stupca i 1. retka 2D matrice je: " + suma);
        else
            System.out.println("\nNe postoji neparni element u 1. stupcu i 1. retku 2D matrice.");

    }

    public void ispisElemenataVektora(int[] vektor){

        System.out.println("\nElementi vektora na parnim indeksima:\n");

        for(i=0;i<n;i++){
            if(i%2==0){
                System.out.println(vektor[i]+" ");
            }
        }
    }

    public void izbornik(int[][] matrica, int[]vektor){

        boolean izbornik = true;
        while(izbornik){

            System.out.println("\n\t-------------------------------------------------------------------------------------"
                             + "\n\n\t01. IZRACUNAJ ARITMETICKU SREDINU SPOREDNE DIJAGONALE MATRICE"
                             + "\n\n\t02. IZRACUNAJ SUMU NEPARNIH ELEMENATA PRVOG RETKA I PRVOG STUPCA MATRICE"
                             + "\n\n\t03. ISPISI SVE BROJEVE NA PARNIM INDEKSIMA VEKTORA"
                             + "\n\n\tEXIT -> PRITISNITE BILO KOJU TIPKU ZA IZLAZ IZ PROGRAMA"
                             + "\n\t-------------------------------------------------------------------------------------");
            
            int izbornik2=input.nextInt();
            switch(izbornik2){
                case 1:
                    arts(matrica);
                    break;
                case 2:
                    sumaNeparnihBr(matrica);
                    break;
                case 3:
                    ispisElemenataVektora(vektor);
                    break;
                default:
                    System.out.println("\nZatvaranje programa!");
                    izbornik=false;
                    break;
            }
        }

       
    }
    
    
    
}
