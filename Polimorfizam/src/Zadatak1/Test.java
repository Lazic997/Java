package Zadatak1;

public class Test {
    
    public static void main(String[] args){

        Konj konj = new Konj();
        Riba riba = new Riba();
        Ptica ptica = new Ptica();
        Zivotinja zivotinja = new Zivotinja();

        Zivotinja[] lista = new Zivotinja[]{konj,riba,ptica,zivotinja};

        for(Zivotinja index : lista)
            index.kreciSe();
    }
}
