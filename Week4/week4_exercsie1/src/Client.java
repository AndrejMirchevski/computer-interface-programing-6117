import java.io.*;
import java.net.Socket;

public class Client {

    private final static String SERVER_ADDRESS = "localhost";
    private final static int SERVER_PORT = 8080;
    public static void main(String[] args) {
        Socket clientSocket = null;
        try {
            clientSocket = new Socket(SERVER_ADDRESS, SERVER_PORT);

            PrintWriter toServer =  new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedReader fromUser = new BufferedReader(new InputStreamReader(System.in));

            toServer.println("Hello server");
            String messageFromServer = fromServer.readLine();
            System.out.println("Server responded: " + messageFromServer);

            System.out.println("Enter num1: ");
            int num1 = Integer.parseInt(fromUser.readLine());

            System.out.println("Enter num2: ");
            int num2 = Integer.parseInt(fromUser.readLine());

            toServer.println(num1);
            toServer.println(num2);

            String resultFromServer = fromServer.readLine();
            System.out.println("Result from server: " + resultFromServer);

        }catch (IOException e){
            System.out.println("Cannot find server at " + SERVER_ADDRESS);
        } finally {
            try {
                clientSocket.close();
            }catch (IOException e){
                System.out.println("Cannot close");
            }
        }
    }
}