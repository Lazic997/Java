public class Zarulja {
    
    private boolean stanje;
    
    Zarulja(){
    }
    
    public void pritisniPrekidac(){
        if(stanje==true)
            stanje=false;
        else
            stanje=true;
    }
    
    public void stanje(){
        if(stanje==true)
            System.out.println("\nSvijetli!");
        else
            System.out.println("\nMrak je!");
    }
}