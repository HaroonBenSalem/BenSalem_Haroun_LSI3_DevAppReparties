package serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Je suis le serveur en attente la connexion d'un client");

        Socket socket = serverSocket.accept();
        System.out.println("Un Client est connecté");

        socket.close();
        serverSocket.close();
    }


}
