package Usporedba;

public class UsporedbaPotrosnje {
    
    static void usporedi(TestAutomobila obj1 , TestAutomobila obj2){
        System.out.println("Sredja vrijednost potrosnje goriva usporedjenih automobila je: "+(obj1.getPotrosioGoriva() + obj2.getPotrosioGoriva()) / 2);
        if(obj1.getPotrosioGoriva() < obj2.getPotrosioGoriva()){
            System.out.println("Vozilo 1 u prosjeku trosi manje goriva: ");
            System.out.println("Naziv: "+ obj1.getNaziv() +"\nPotrosio goriva: " + obj1.getPotrosioGoriva() +"\nPredjen put: " + obj1.getPredjenPut());
            
        }
        else if(obj2.getPotrosioGoriva() < obj1.getPotrosioGoriva()){
            System.out.println("Vozilo 2 u prosjeku trosi manje goriva: ");
            System.out.println("Naziv: "+ obj2.getNaziv() +"\nPotrosio goriva: " + obj2.getPotrosioGoriva() +"\nPredjen put: " + obj2.getPredjenPut());
        }
    }
    
}
