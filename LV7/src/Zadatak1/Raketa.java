package Zadatak1;

public class Raketa extends Thread{

    private String ime;
    private LansirnaRampa rampa;

    public Raketa(){

    }

    public String getIme(String ime){
        return ime;
    }

    public void setIme(String ime){
        this.ime = ime;
    }
    
    @Override
    public void run(){

        rampa = new LansirnaRampa();
        System.out.println(this.ime + ": ");
        System.out.println("Uskoro krece lansiranje!");

        try{
            rampa.lansiranje();
        }catch(Exception e){
            System.out.println("Greska pri lansiranju!");
        }

        System.out.println(this.ime + " raketa je uspjesno lansirana!");
    }
}
