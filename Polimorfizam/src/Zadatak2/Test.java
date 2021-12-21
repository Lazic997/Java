package Zadatak2;

public class Test {
    public static void main(String[] args){

        Direktor direktor = new Direktor();
        Tajnica tajnica = new Tajnica();
        Vozac vozac = new Vozac();

        direktor.setId("1");
        direktor.setIme("ime1");
        direktor.setPrezime("prezime1");

        tajnica.setId("2");
        tajnica.setIme("ime2");
        tajnica.setPrezime("prezime2");

        vozac.setId("3");
        vozac.setIme("ime3");
        vozac.setPrezime("prezime3");

        direktor.predstaviSe(direktor); 
        direktor.radi();

        tajnica.predstaviSe(tajnica); 
        tajnica.radi();

        vozac.predstaviSe(vozac);
        vozac.radi();
    }
}
