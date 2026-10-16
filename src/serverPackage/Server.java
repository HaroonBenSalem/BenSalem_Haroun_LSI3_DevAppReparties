package serverPackage;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Je suis le serveur en attente la connexion d'un client");

        Socket socket = serverSocket.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        System.out.println("Un Client est connecté");

        while (true) {
            int x = in.readInt();
            int resultat = x*5;
            System.out.println("Recu" + x + "-- envoi " + resultat);
            out.writeInt(resultat);
            out.flush();
        }
    }
}
