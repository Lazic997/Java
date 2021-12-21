package Zadatak2;

public class Test {
    public static void main(String[] args){

        Direktor direktor = new Direktor();
        Tajnica tajnica = new Tajnica();
        Vozac vozac = new Vozac();

        direktor.setId("1");
        direktor.setIme("Bill");
        direktor.setPrezime("Kill");

        tajnica.setId("2");
        tajnica.setIme("Billa");
        tajnica.setPrezime("od Killa");

        vozac.setId("3");
        vozac.setIme("Vozac");
        vozac.setPrezime("od Killa");

        Zaposlenik.predstaviSe(direktor);
        direktor.radi();

        Zaposlenik.predstaviSe(tajnica);
        tajnica.radi();

        Zaposlenik.predstaviSe(vozac);
        vozac.radi();
    }
}
