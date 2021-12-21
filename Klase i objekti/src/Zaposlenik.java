public class Zaposlenik {
    private int staz;
    private int starost;
    private double placa;
    
    Zaposlenik(int noviStaz,int novaStarost,double novaPlaca){
        staz=noviStaz;
        starost=novaStarost;
        placa=novaPlaca;
    }

    public int getStaz() {
        return staz;
    }

    public int getStarost() {
        return starost;
    }

    public double getPlaca() {
        return placa;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    public void setStarost(int starost) {
        this.starost = starost;
    }

    public void setPlaca(double placa) {
        this.placa = placa;
    }
    
    public void m1(){
        double ukupnaZarada;
        ukupnaZarada = 12*staz*placa;
        System.out.println("\nUkupna zarada" + ukupnaZarada);
    }

    public static void m2(Zaposlenik z){
        double ukupnaZarada;
        ukupnaZarada = 12*z.staz*z.placa;
        System.out.println("\nUkupna zarada" + ukupnaZarada);
    }
   
}
