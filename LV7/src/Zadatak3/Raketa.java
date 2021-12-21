package Zadatak3;

public class Raketa implements Runnable{

    private Thread t;
    private String ime;
    private LansirnaRampa rampa;

    public Raketa(String ime,LansirnaRampa rampa){
        this.ime = ime;
        this.rampa = rampa;
    }

    @Override
    public void run(){
        
        try{
            rampa.lansiranje(); // metodu mozemo sihnronizirati i tako da ovu liniju koda stavimo u synchronized blok
        }catch(Exception e){
            System.out.println("Greska pri lansiranju!");
        }
       
        System.out.println(this.ime + " raketa je uspjesno lansirana!");
        
    }

    public void start(){

        System.out.println("Pocinje lansiranje: " + ime);
        if(t == null){
            t = new Thread(this,ime);
            t.start();   
        }
    }


}
