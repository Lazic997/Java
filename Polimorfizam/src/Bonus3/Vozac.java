package Bonus3;

public class Vozac implements Zaposlenik{
    
    public void radi(){
        System.out.println("Vozim!");
    }

    @Override
    public void predstaviSe() {
        System.out.println("ID: ");
        System.out.println("Ime: ");
        System.out.println("Prezime: ");
        System.out.println("Tip objekta: " + this.getClass().getSimpleName());
    }
}
