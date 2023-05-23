package Jeu;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface NumberMapper extends Remote {
    public int gerNumber() throws RemoteException;
    public boolean checkWin(int nbr) throws RemoteException;
}