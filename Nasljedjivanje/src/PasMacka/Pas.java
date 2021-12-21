package PasMacka;

import Sisavac.Sisavac;

public class Pas extends Sisavac{
    
    protected String vrstaPsa;

    public Pas(){    
    }

    public String getVrstaPsa(){
        return vrstaPsa;
    }

    public void setVrstaPsa(String vrstaPsa){
        this.vrstaPsa = vrstaPsa;
    }

    public static void opis (Pas pas){
        System.out.println("Pas: ");
        System.out.println("Dob: " + pas.getDob() + " godina");
        System.out.println("Vrsta: "+ pas.getVrstaPsa());
        System.out.println("Tezina: " + pas.getTezina() + " kg");
    }
}
