package ticket_management;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            // Start RMI Registry
            LocateRegistry.createRegistry(1099);
            System.out.println("RMI Registry started.");

            // Bind the Remote Object
            RemoteService remoteService = new RemoteServiceImpl();
            Naming.rebind("TicketService", remoteService);

            System.out.println("Service is bound and ready for use.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
