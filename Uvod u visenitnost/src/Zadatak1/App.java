package Zadatak1;

public class App {
    public static void main(String[] args){

        Raketa raketa1 = new Raketa();
        Raketa raketa2 = new Raketa();
        
        raketa1.setIme("Prva");
        raketa2.setIme("Druga");

        raketa1.start();
        raketa2.start();
    }
}
