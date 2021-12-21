package Zadatak3;

public class App {
    public static void main(String[] args){

        LansirnaRampa rampa = new LansirnaRampa();
        Raketa thread1 = new Raketa("Raketa1" , rampa);
        Raketa thread2 = new Raketa("Raketa2" , rampa);


        thread1.start();
        
        thread2.start();
    }
}
