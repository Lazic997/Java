public class Test {
    
    public static void main(String[] args){
        
        Zarulja Osram = new Zarulja();
        
        for(int i=0;i<5;i++){
            Osram.stanje();
            Osram.pritisniPrekidac();
        }
        
        Zaposlenik vozac = new Zaposlenik(2,24,4500.50);
        
        vozac.m1();
	    Zaposlenik.m2(vozac);
        
    }
}
