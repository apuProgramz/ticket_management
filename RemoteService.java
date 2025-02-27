package ticket_management;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteService extends Remote {
    String reserveTicket(String user, int ticketCount) throws RemoteException;
    String makePayment(String user, double amount) throws RemoteException;
    String cancelTicket(String user, int ticketCount) throws RemoteException;
}
