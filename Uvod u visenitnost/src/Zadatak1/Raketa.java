package Zadatak1;

public class Raketa extends Thread {
    
    private String ime;
    private LansirnaRampa rampa;

    public Raketa(String ime, LansirnaRampa rampa) {
        
        this.ime = ime;
        this.rampa = rampa;
        
    }
    
    @Override
    public void run(){
        
        System.out.println("Raketa: " + ime + ", uskoro krece lansiranje!");
        try{
            rampa.lansiraj();
        }catch(Exception e){
        }
        System.out.println("Raketa: " + ime + ", uspjesno lansirana!");
    }
    
}
