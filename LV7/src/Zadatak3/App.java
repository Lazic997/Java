package Zadatak3;

public class App {
    public static void main(String[] args){

        Raketa raketa1 = new Raketa("Prva");
        Thread thread1 = new Thread(raketa1);

        Raketa raketa2= new Raketa("Druga");
        Thread thread2 = new Thread(raketa2);

        thread1.start();
        try{
            thread1.join();
        }catch(Exception e){

        }
        thread2.start();
    }
}
