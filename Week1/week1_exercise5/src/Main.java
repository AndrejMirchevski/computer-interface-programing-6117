import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Path filePath = Paths.get("Week1/binaryF.bin");
        byte[] dataToWrite = {1, 2, 3, 4, 5, 'C'};

        try{
            Files.write(filePath, dataToWrite);
            System.out.println("Data successfully written to file ");

             byte [] readData = Files.readAllBytes(filePath);
             for (byte b: readData){
                 System.out.println(b + " ");
             }
        }catch (IOException e) {e.printStackTrace();}
    }
}