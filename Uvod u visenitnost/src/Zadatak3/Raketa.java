package Zadatak3;

public class Raketa implements Runnable {
    
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
            rampa.lansiraj(); // metodu mozemo sihnronizirati i tako da ovu liniju koda stavimo u synchronized blok
        }catch(Exception e){
        }
        System.out.println("Raketa: " + ime + ", uspjesno lansirana!");
    }
    
}
