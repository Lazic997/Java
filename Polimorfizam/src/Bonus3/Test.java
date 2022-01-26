package Bonus3;

public class Test {
    
    public static void main(String[] args){

        Direktor direktor = new Direktor();
        Tajnica tajnica = new Tajnica();
        Vozac vozac = new Vozac();

        System.out.println(" ");
        direktor.radi();
        direktor.predstaviSe();

        System.out.println(" ");
        tajnica.radi();
        tajnica.predstaviSe();

        System.out.println(" ");
        vozac.radi();
        vozac.predstaviSe();

        

    }
}
