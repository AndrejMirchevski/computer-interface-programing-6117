
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileMerger {
    public static void main(String[] args) {


        if(args.length < 2){
            System.out.println("missing arguments");
        }


        String command = args[0];

        try{
            switch (command){
                case "merge":
                    merge();
                    break;
                case "ping":
                    ping(args[1]);
                    break;
                case "append":
                    append(args[1], args[2]);
                    break;
            }

        }catch (Exception e){
            System.out.println("invalid option");
        }
    }

    static void merge() {



    }

    static void ping(String hostname){
        try{

            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("Checking if its reachable..." + address.isReachable(5000));

        }catch (UnknownHostException e){
            System.out.println("can not find that address");
        } catch (IOException e) {

        }
    }

    static void append(String file1, String file2) throws IOException {
        Path source = Paths.get(file1);
        Path destination = Paths.get(file2);

        String lines = String.valueOf(Files.readAllLines(source));


        try{
            Files.write(file2, lines.getBytes(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }catch (IOException e){
            System.out.println("error while appending");
        }
    }
}