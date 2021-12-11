package PasMacka;

import Sisavac.Sisavac;

public class Macka extends Sisavac{
    
    protected String vrstaMacke;

    public Macka(){
    }

    public String getVrstaMacke(){
        return vrstaMacke;
    }

    public void setVrstaMacke(String vrstaMacke){
        this.vrstaMacke = vrstaMacke;
    }

    public static void opis (Macka macka){
        System.out.println("Macka: ");
        System.out.println("Dob: " + macka.getDob() + " godina");
        System.out.println("Vrsta: "+ macka.getVrstaMacke());
        System.out.println("Tezina: " + macka.getTezina() + " kg");
    }
}
