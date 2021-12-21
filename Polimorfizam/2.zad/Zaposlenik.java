package Zadatak2;

public abstract class Zaposlenik {
    
    private String id;
    private String ime;
    private String prezime;

    public Zaposlenik(){
    }

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

    public static <T> void predstaviSe(T zaposlenik){

        System.out.println();
        System.out.println("ID: " + ((Zaposlenik) zaposlenik).getId());
        System.out.println("Ime: " + ((Zaposlenik) zaposlenik).getIme());
        System.out.println("Prezime: " + ((Zaposlenik) zaposlenik).getPrezime());

        System.out.println("Tip objekta: "+zaposlenik.getClass().getSimpleName());
        
    }

    public void radi(){

    }
}
