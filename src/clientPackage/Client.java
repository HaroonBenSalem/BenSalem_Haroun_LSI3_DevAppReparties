package clientPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Je suis un client pas encore connecté");
        Socket socket = new Socket("127.0.0.1", 1234);
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("Je suis un client connecté");
        while (true) {
            System.out.println("Entrez un entier :");
            int x = sc.nextInt();
            out.writeInt(x);
            out.flush();
            if (x == 0) break;
            int resultat = in.readInt();
            System.out.println(x + "* 5 =  " + resultat);
        }
    }
}