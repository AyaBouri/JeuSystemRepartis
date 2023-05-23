package Jeu;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)throws IOException {
        Socket socket=new Socket("localhost",5555);
        System.out.println("Connexion.....");
        OutputStream outputStream= socket.getOutputStream();
        InputStream is=socket.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        DataOutputStream dos=new DataOutputStream(outputStream);
        System.out.println("Entrer un nouveau nombe..");
        Scanner s=new Scanner(System.in);
        int nbr=s.nextInt();
        dos.writeInt(nbr);
        PrintWriter writer=new PrintWriter(outputStream,true);
    }
}