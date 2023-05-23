package Jeu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.Month;

public class Service {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket=new ServerSocket(5555);
        System.out.println("Démmarage du Serveur.....");
        Socket s;
        int secret=(int) Math.random()+100;
        int nbr=0;
        while (nbr<2){
            s=serverSocket.accept();
            Jeu jeu=new Jeu(s,secret);
            Thread th=new Thread(jeu);
            th.start();
            nbr++;
        }
    }
}
//throws RemoteException