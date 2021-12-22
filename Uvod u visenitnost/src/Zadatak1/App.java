package Zadatak1;

public class App {
    public static void main(String[] args){

        LansirnaRampa rampa = new LansirnaRampa();
        Raketa raketa1 = new Raketa("prva", rampa);
        Raketa raketa2 = new Raketa("druga", rampa);
        
        raketa1.start();
        raketa2.start();
    }
}
