import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            // Lookup the Remote Object
            RemoteService remoteService = (RemoteService) Naming.lookup("rmi://localhost/TicketService");

            // Interact with the Remote Methods
            System.out.println(remoteService.reserveTicket("John Doe", 2));
            System.out.println(remoteService.makePayment("John Doe", 50.0));
            System.out.println(remoteService.cancelTicket("John Doe", 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
