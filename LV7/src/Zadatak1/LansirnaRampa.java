package Zadatak1;

public class LansirnaRampa {
    
    public void lansiranje(){
        for(int i = 10 ; i > 0 ; i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }

}
