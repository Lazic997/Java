package Zadatak1;

public class Test {
    
    public static void main(String[] args){

    Zivotinja zivotinja = new Zivotinja();
    Konj konj = new Konj();
    Ptica ptica = new Ptica();
    Riba riba = new Riba();

    Zivotinja[] lista = new Zivotinja[]{zivotinja,konj,ptica,riba};

    for(Zivotinja index : lista)
        index.kreciSe();

    }
    
    
}
