package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server{
    
    public static void main (String[] args) throws Exception{

        DatagramSocket dS = new DatagramSocket(9999);

        while(true){

            byte[] b = new byte[1024];
            DatagramPacket dP = new DatagramPacket (b,b.length);
            dS.receive(dP);

            String packetFromClient = new String(dP.getData(), 0 ,dP.getLength());

            System.out.println("\nPaket primljen: "
                                +"\nHost: "+dP.getAddress()
                                +"\nPort: "+dP.getPort()
                                +"\nDuljina: "+dP.getLength()
                                +"\nSadrzi: " + packetFromClient);

            if(packetFromClient.contains("pso1")||
                packetFromClient.contains("pso2")||
                packetFromClient.contains("pso3")||
                packetFromClient.contains("uvr1")||
                packetFromClient.contains("uvr2")||
                packetFromClient.contains("uvr3")){

                    packetFromClient = packetFromClient.replace("pso1","****");
                    packetFromClient = packetFromClient.replace("pso2","****");
                    packetFromClient = packetFromClient.replace("pso3","****");
                    packetFromClient = packetFromClient.replace("uvr1","****");
                    packetFromClient = packetFromClient.replace("uvr2","****");
                    packetFromClient = packetFromClient.replace("uvr3","****");
            }

            b = packetFromClient.getBytes();

            DatagramPacket packetForClient = new DatagramPacket(b,b.length,dP.getAddress(),dP.getPort());
            dS.send(packetForClient);
            System.out.println("\n\tPaket poslan!\n");
        }
    }
}
