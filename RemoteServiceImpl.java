import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServiceImpl extends UnicastRemoteObject implements RemoteService {

    protected RemoteServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public String reserveTicket(String user, int ticketCount) throws RemoteException {
        // Simulate reservation logic
        return "Reserved " + ticketCount + " tickets for " + user;
    }

    @Override
    public String makePayment(String user, double amount) throws RemoteException {
        // Simulate payment logic
        return "Payment of $" + amount + " received from " + user;
    }

    @Override
    public String cancelTicket(String user, int ticketCount) throws RemoteException {
        // Simulate cancellation logic
        return "Cancelled " + ticketCount + " tickets for " + user;
    }
}
