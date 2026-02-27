import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hostname: ");
        String hostname = scanner.nextLine();
        try {
            //InetAddress address = InetAddress.getByName(hostname);
            //System.out.println("IP address: " + address.getHostAddress());
            InetAddress[] addresses = InetAddress.getAllByName(hostname);
            for(InetAddress address : addresses){
                System.out.println(address);
            }
        } catch (UnknownHostException e){
            e.printStackTrace();
        }
    }
}