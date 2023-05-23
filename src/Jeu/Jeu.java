package Jeu;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;

public class Jeu extends Thread{
    private Socket s;
    private int secret;
    private boolean fin=false;

    public Jeu(Socket s, int secret, boolean fin) {
        this.s = s;
        this.secret = secret;
        //this.fin = fin;
    }

    public Jeu(Socket s, int secret) {
    }

    @Override
    public void run(){
        System.out.println("le serveur a accepter le client");
        try {
            InputStream is=s.getInputStream();
            InputStreamReader os=new InputStreamReader(is);
            BufferedReader bufferedReader=new BufferedReader(os);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}