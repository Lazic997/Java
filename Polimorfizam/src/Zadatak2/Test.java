package Zadatak2;

public class Test {
    
    public static void main(String[] args){

        Direktor direktor = new Direktor();
        Tajnica tajnica = new Tajnica();
        Vozac vozac = new Vozac();

        direktor.radi();
        direktor.predstaviSe(direktor);

        tajnica.radi();
        tajnica.predstaviSe(tajnica);

        vozac.radi();
        vozac.predstaviSe(vozac);

        

    }
}
