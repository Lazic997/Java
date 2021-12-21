package Zadatak3;

public class LansirnaRampa {
    
    public synchronized void lansiranje(){ //metoda je sinhroznizirana
        for(int i = 10 ; i > 0 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

}
