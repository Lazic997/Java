import java.io.Serializable;

public class Student implements Serializable{
    
    private int maticniBroj;
    private String ime;
    private String prezime;
    private String fakultet;
    private String smijer;
    private int godina;
    private double ocjena;
    
    public Student(){
    }

    public Student(int maticniBroj, String ime, String prezime, String fakultet, String smijer, int godina, double ocjena) {
        this.maticniBroj = maticniBroj;
        this.ime = ime;
        this.prezime = prezime;
        this.fakultet = fakultet;
        this.smijer = smijer;
        this.godina = godina;
        this.ocjena = ocjena;
    }

    public void setMaticniBroj(int maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public void setSmijer(String smijer) {
        this.smijer = smijer;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setOcjena(double ocjena) {
        this.ocjena = ocjena;
    }

    public int getMaticniBroj() {
        return maticniBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getSmijer() {
        return smijer;
    }

    public int getGodina() {
        return godina;
    }

    public double getOcjena() {
        return ocjena;
    }
    
    
}