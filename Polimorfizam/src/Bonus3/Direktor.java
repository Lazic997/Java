package Bonus3;

public class Direktor implements Zaposlenik{
    
    public void radi(){
        System.out.println("Odlucujem!");
    }

    @Override
    public void predstaviSe() {
        System.out.println("ID: ");
        System.out.println("Ime: ");
        System.out.println("Prezime: ");
        System.out.println("Tip objekta: " + this.getClass().getSimpleName());
    }
    
}
