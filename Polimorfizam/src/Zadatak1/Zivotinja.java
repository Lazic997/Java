package Zadatak1;

public class Zivotinja {
    
    protected String vrsta;

    public Zivotinja(){
    }

    public void setVrsta(String vrsta){
        this.vrsta = vrsta;
    }

    public String getVrsta(){
        return vrsta;
    }

    public void kreciSe(){
        System.out.println("Zivotinja se krece");
    }
}
