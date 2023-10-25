package TP3;

import java.io.*;
import java.net.*;


public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientsocket = new Socket("localhost", 12345);
        System.out.println("Connecté au serveur : " + clientsocket.getRemoteSocketAddress());

        PrintWriter out = new PrintWriter(clientsocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
        BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while ((input = consoleInput.readLine()) != null) {
            out.println(input);
            String serverResponse = in.readLine();
            System.out.println("Réponse du serveur : " + serverResponse);
        }
    }
}
