import javax.xml.transform.sax.SAXResult;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server is listening on port" + PORT);
            System.out.println("Waiting for client connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection established with client " + clientSocket.getInetAddress());

            PrintWriter toClient = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream()), true);
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String messageFromClient = fromClient.readLine();
            System.out.println("Client sent: " + messageFromClient);

            toClient.println("Hello clint");

            int num1 = Integer.parseInt(fromClient.readLine());
            int num2 = Integer.parseInt(fromClient.readLine());

            System.out.println("Client sent num1: " + num1 + " and num2: " + num2);
            int result = num1 + num2;

            toClient.println(result);

        } catch (Exception e) {
            System.out.println("Server Error" + e.getMessage());
        }
    }

    private final static int PORT = 8080;
}
