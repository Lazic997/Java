package Zadatak1;

public class Konj extends Zivotinja{
    //posto nasljedjuje klasu Zivotinja, nasljedjuje i njene parametre (u ovom slucaju "vrsta")
    public Konj(){
        setVrsta("Konj");
    }

    public void kreciSe(){
        System.out.println("Trcim!");
    }



}
