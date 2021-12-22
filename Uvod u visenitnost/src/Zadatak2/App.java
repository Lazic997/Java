package Zadatak2;

public class App {
    public static void main(String[] args){

        LansirnaRampa rampa = new LansirnaRampa();
        Thread thread1 = new Thread(new Raketa("prva", rampa));
        Thread thread2 = new Thread(new Raketa("druga", rampa));
        
        thread1.start();
        thread2.start();
    }
}
