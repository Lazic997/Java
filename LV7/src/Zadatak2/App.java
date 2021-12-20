package Zadatak2;

public class App {
    public static void main(String[] args){

        Raketa raketa1 = new Raketa("Prva");
        Thread thread1 = new Thread(raketa1);

        Raketa raketa2= new Raketa("Druga");
        Thread thread2 = new Thread(raketa2);

        thread1.start();
        thread2.start();
    }
}
