package Jeu;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
public class NumberManagerImpl extends UnicastRemoteObject implements NumberMapper{
    private number nbr;

    protected NumberManagerImpl() throws RemoteException {
    }

    protected NumberManagerImpl(int port) throws RemoteException {
        super(port);
    }

    protected NumberManagerImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public int gerNumber() throws RemoteException {
        return 0;
    }

    @Override
    public boolean checkWin(int nbr) throws RemoteException {
        return false;
    }
}