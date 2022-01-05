package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) throws Exception{
    
    
        //Slanje paketa serveru
        DatagramSocket dS = new DatagramSocket();
        Scanner input = new Scanner(System.in);
        byte[] b = new byte[1024]; 
    
        System.out.println("Unesite poruku za server: ");
        String packetForServer=input.nextLine();
        b = packetForServer.getBytes();

        DatagramPacket dP = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),9999);
        dS.send(dP);

        //Primanje paketa od servera
        DatagramPacket packetFromServer = new DatagramPacket(b,b.length);
        dS.receive(packetFromServer);
        System.out.println("\nPaket primljen: "
                            +"\nHost: "+packetFromServer.getAddress()
                            +"\nPort: "+packetFromServer.getPort()
                            +"\nDuljina: "+packetFromServer.getLength()
                            +"\nSadrzi: " + new String(packetFromServer.getData(),0,packetFromServer.getLength()));

    }
}
