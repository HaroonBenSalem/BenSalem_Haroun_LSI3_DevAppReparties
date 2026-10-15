package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Je suis un client pas encore connecté");

        Socket socket = new Socket("127.0.0.1", 1234);
        System.out.println("Je suis un client connecté");




    }


}
