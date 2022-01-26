package Zadatak2;

public abstract class Zaposlenik {
    
    private String id;
    private String ime;
    private String prezime;

    public void setId(String id){
        this.id = id;
    }

    public void setIme(String ime){
        this.ime = ime;
    }

    public void setPrezime(String prezime){
        this.prezime = prezime;
    }

    public String getId(){
        return id;
    }

    public String getIme(){
        return ime;
    }

    public String getPrezime(){
        return prezime;
    }

    public void radi(){

    }

    public void predstaviSe(Object object){
        System.out.println("ID: " + this.getId());
        System.out.println("Ime: " + this.getIme());
        System.out.println("Prezime: " + this.getPrezime());
        System.out.println("Tip objekta: " + this.getClass().getSimpleName());
    }

}
