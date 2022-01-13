package Usporedba;

import java.util.Scanner;

public class TestAutomobila {
    
    private String naziv;
    private double potrosioGoriva;
    private int predjenPut;
    
    public TestAutomobila (String naziv,double potrosioGoriva,int predjenPut){
        this.naziv = naziv;
        this.potrosioGoriva = potrosioGoriva;
        this.predjenPut = predjenPut;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getPotrosioGoriva() {
        return potrosioGoriva;
    }

    public void setPotrosioGoriva(double potrosioGoriva) {
        this.potrosioGoriva = potrosioGoriva;
    }

    public int getPredjenPut() {
        return predjenPut;
    }

    public void setPredjenPut(int predjenPut) {
        this.predjenPut = predjenPut;
    }
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);  

        try{

            System.out.println("Unesite naziv 1. vozila, njegovu stanje potrosenog goriva i predjen put: ");
            TestAutomobila vozilo1 = new TestAutomobila(input.next() , input.nextDouble(),input.nextInt());
            
            System.out.println("Unesite naziv 2. vozila, njegovu stanje potrosenog goriva i predjen put: ");
            TestAutomobila vozilo2 = new TestAutomobila(input.next() , input.nextDouble(),input.nextInt());

            UsporedbaPotrosnje.usporedi(vozilo1,vozilo2);

        }catch(Exception e){
        }        
        
    }

}
