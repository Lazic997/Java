package Zadatak2;

public class Raketa implements Runnable{

    private String ime;
    private LansirnaRampa rampa;

    public Raketa(String ime){
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
