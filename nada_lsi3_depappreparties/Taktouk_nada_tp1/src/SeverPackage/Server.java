//package SeverPackage;


//import java.io.InputStream;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.io.IOException;

//public class Server {

	//public static void main(String[] args) throws IOException {
		
		// La premiÃ¨re Ã©tape : crÃ©ation de l'objet ServerSocket
		//int serverPort= 1234;
		//ServerSocket serverSocket = new ServerSocket(serverPort);
		//System.out.println("Je suis un serveur en attente la connexion d'un client ");
		
		// La deuxiÃ¨me Ã©tape : crÃ©ation de l'objet Socket cÃ´tÃ© serveur suite Ã  la connexion du client
		//Socket socket = serverSocket.accept();
		//System.out.println("un client est connectÃ©");
		//Operation operation=new (Operation)in.readObject();
		//int res=calculres(operation);
		//ObjectOutputStream out = new ObjectOutputStream()
		
		
		
		//try{
			/*On reprend l'exercie 3 du TD 1,
			* Dans cet exemple on suppose que le serveur a reÃ§u la donnÃ©e du client. (cÃ d : 
			 * un Ã©vÃ©nement de rÃ©ception 
			 * Pour cela on dÃ©finit dans cette application un objet de type inputstream (pour prÃ©parer la lecture d'un octet et l'afficher)*/
			//InputStream is = socket.getInputStream();
		
			//int val=is.read()*4;
		
			//System.out.println("La valeur Ã  envoyer au  client "+ val);
			/*le serveur va Ã©mmetre le rÃ©sul */
			
			//OutputStream os = socket.getOutputStream();
			//os.write(val);
		
			//}
			//catch (Exception e) {e.printStackTrace();}
		
		
		
		
		
		
		
		
		// La derniÃ¨re Ã©tape : fermeture de la connexion
		//socket.close();
		
	//}

//}


/*package SeverPackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
			
public class Server {
    public static void main(String[] args) throws IOException {
    	int serverPort= 1234;
		ServerSocket serverSocket = new ServerSocket(serverPort);
        System.out.println("Serveur en attente de connexions...");

        try {
        	
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté");

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                calcul operation = (calcul) in.readObject();

                int result = calculateResult(operation);

            
      
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject(result);

                clientSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int calculateResult(   calcul operation ) {
        int operand1 = operation.getOperand1();
        char operator = operation.getOperator();
        int operand2 = operation.getOperand2();

        int result = 0;
        switch (operator)  {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
            	 result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;

                } else {
                    
                }
                break;
        }
        return result;
    }
}*/







package SeverPackage;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        try {
        	int serverPort= 1234;
    		ServerSocket serverSocket = new ServerSocket(serverPort);
           //ServerSocket serverSocket = new ServerSocket(1234); // Utilisez le port de votre choix
            System.out.println("Serveur en attente de connexions...");

            while (true) {
            	
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connecté");

                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                calcul operation = (calcul) in.readObject();

                int result = calculateResult(operation);

                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject(result);

                clientSocket.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static int calculateResult(calcul operation) {
        int operand1 = operation.getOperand1();
        char operator = operation.getOperator();
        int operand2 = operation.getOperand2();

        int result = 0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    // Handle division by zero error
                }
                break;
        }
        return result;
    }
}































		


	