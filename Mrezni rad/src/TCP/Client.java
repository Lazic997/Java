package TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception{

        Socket client = new Socket(/*host*/"localhost",/*port*/9999);
        PrintWriter outputToServer = new PrintWriter(client.getOutputStream(),true);
        BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));

        Scanner input = new Scanner(System.in);

        String messageForServer = "";
        System.out.println("\nPosaljite poruku serveru: ");
        while(!"stop".equalsIgnoreCase(messageForServer)){

            messageForServer = input.nextLine();
            outputToServer.println(messageForServer);
            String responseFromServer = inputFromServer.readLine();
            System.out.println(responseFromServer);
        }

        input.close();
        inputFromServer.close();
        outputToServer.close();
        client.close();



    }

}
