package MatricaIThreads;

import java.util.Scanner;

public class Matrica {
    
    public static void main(String[] args){
        
        int matrica[][] = new int[10][10];
        int m = 0;
        int k = 0; //indeks retka matrice kroz koji ce nit prolaziti
        int gGranica = 9; // Interval elemenata koji ce se popunjavati u matricu
        int dGranica = 1; //
        Thread nit[] = new Thread[10];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite velicinu M za kvadratnu matricu u intervalu [2<M<10]");
        
        do{
            
            m = input.nextInt();
            
            if(m < 2 || m>10){
                System.out.println("Velicina koju se unjeli je pogresna, molimo unesite velicinu M u intervalu [2<M<10]!");
            }
            
        }while(m < 2 || m>10);
        
        //popunjavanje matrice
        
        System.out.println("Matrica: ");
        for(int i = 0 ; i<m;i++){
            for(int j = 0 ; j<m;j++){
                matrica[i][j] = (int)(Math.random()*(gGranica-dGranica+1)+dGranica);
                System.out.print(matrica [i][j] +" ");
            }
            System.out.print("\n");
        }
        
        //treba mi da inicijaliziram m broj niti kako bi svaka prolazila prolazila kroz m elemenata za svoj redak
        
        for(int i = 0;i<m;i++){
            nit[i] = new Thread(new Threads(matrica,m,k++));
            nit[i].start();
        }    
        
    }
}
