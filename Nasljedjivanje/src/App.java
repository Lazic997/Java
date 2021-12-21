import PasMacka.Macka;
import PasMacka.Pas;

public class App {
    public static void main(String[] args) throws Exception {
        
        Macka macka = new Macka();
        Pas pas = new Pas();

        macka.setDob(1);
        macka.setTezina(1.02);
        macka.setVrstaMacke("Vrsta macke");

        pas.setDob(4);
        pas.setTezina(4.57);
        pas.setVrstaPsa("Vrsta psa");

        System.out.println();
        Macka.opis(macka);
        System.out.println();
        Pas.opis(pas);
    }
}
