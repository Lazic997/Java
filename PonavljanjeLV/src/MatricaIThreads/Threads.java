package MatricaIThreads;

public class Threads implements Runnable{

    private int[][] matrica;
    private int m;
    private int k;
    int max = 0;

    public Threads(int[][] matrica, int m,int k) {
        this.matrica = matrica;
        this.m = m;
        this.k = k;
    }
    
    @Override
    public void run() {
        //trebam metodu kojoj predajem matricu, velicinu m matrice i k broj redka matrice za koju ce se zauzeti nit
        //metodu treba da dijeli svaka nit,tako da nit prolazi kroz svoj redak, i u retku trazi najveci broj i ispisuje ga na ekran
        
        for(int j = 0; j<m ; j++){
            if(matrica[k][j] > max){
                max = matrica [k][j];
            }
        }
        
        System.out.println("Nit" + k + " je zavrsila s radom, najveci broj u retku je: " + max);
        
    } 
}
