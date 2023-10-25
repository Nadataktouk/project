package TP3;
import java.io.*;
import java.net.*;

public class MultiThreadedServer extends Thread {
	
	 public static void main(String[] args) throws IOException {
	        ServerSocket serversocket = new ServerSocket(12345);
	        int clientCount = 0;

	        while (true) {
	            Socket clientSocket = serversocket.accept();
	            clientCount++;
	            System.out.println("Client " + clientCount + " connecté depuis " + clientSocket.getRemoteSocketAddress());

	            // Crée un thread pour gérer le client
	            ClientHandler clientHandler = new ClientHandler(clientSocket, clientCount);
	            new Thread(clientHandler).start();
	        }
	    }
	}

	class ClientHandler implements Runnable {
	    private Socket clientSocket;
	    private int clientNumber;

	    public ClientHandler(Socket clientSocket, int clientNumber) {
	        this.clientSocket = clientSocket;
	        this.clientNumber = clientNumber;
	    }

	    public void run() {
	        try {
	            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	            out.println("Vous êtes le client " + clientNumber);

	            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	            String clientMessage;
	            while ((clientMessage = in.readLine()) != null) {
	                System.out.println("Client " + clientNumber + " : " + clientMessage);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


	


