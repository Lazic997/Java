package TCP;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 9999));
        
        System.out.println();
        System.out.println("Postavljen novi posluzitelj: " + serverSocket.toString());

        Socket clientSocket = serverSocket.accept();
        System.out.println("Client>> Imamo klijenta: "+clientSocket.getInetAddress());

        BufferedReader inputFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter outputToClient = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()),true);

        String messageFromClient = "";
        while(!"stop".equalsIgnoreCase(messageFromClient)){

            messageFromClient = inputFromClient.readLine();
            System.out.println("Client>> "+messageFromClient);

            if(messageFromClient.toLowerCase().contains("pso1") ||
                    messageFromClient.toLowerCase().contains("pso2") ||
                    messageFromClient.toLowerCase().contains("pso3") ||
                    messageFromClient.toLowerCase().contains("uvr1") ||
                    messageFromClient.toLowerCase().contains("uvr2") ||
                    messageFromClient.toLowerCase().contains("uvr3")){

                messageFromClient = messageFromClient.replace("pso1", "****");
                messageFromClient = messageFromClient.replace("pso2", "****");
                messageFromClient = messageFromClient.replace("pso3", "****");
                messageFromClient = messageFromClient.replace("uvr1", "****");
                messageFromClient = messageFromClient.replace("uvr2", "****");
                messageFromClient = messageFromClient.replace("uvr3", "****");
                outputToClient.println("Server>> "+ messageFromClient);
                
            }
            else{
                outputToClient.println("Server>> Recieved message! ");
            }
        }
        
        inputFromClient.close();
        outputToClient.close();
        clientSocket.close();
        serverSocket.close();
    }
}
