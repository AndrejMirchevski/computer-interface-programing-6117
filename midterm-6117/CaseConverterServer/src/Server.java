import javax.management.ObjectName;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static final int PORT = 8080;

    public static void main(String[] args) {
        System.out.println("Server is on port: " + PORT);
        try (ServerSocket serverSocket = new ServerSocket(PORT)){

        while(true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("client is connected");

            new Thread(() -> Client(clientSocket)).start();
        }

        }catch (IOException e){

        }
    }

    public static void Client(Socket socket){
        try{
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(),true);

            String userInput;

            while ((userInput = in.readLine())!= null){
                String word = in.readLine();
                String format = in.readLine();

                Convetor convetor = new Convetor(userInput, out);
                new Thread((Runnable) convetor).start();
            }


        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            try{
                socket.close();
                System.out.println("client has disconnected");
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
