import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    public static void main(String[] args) {
        Path filepath = Paths.get("Week1/week1_exercise1/src");
        String fileName = "uniqueFile_";
        long timestamp = System.currentTimeMillis();
        Path filePath = Paths.get(fileName + timestamp + ".txt");

        try {
            if(Files.exists(filePath)){
                System.out.println("File already exists");
            }else{
                Files.createFile(filePath);
            }

            File file = new File(fileName + timestamp + ".txt");
            System.out.println("File name: " + file.getName());
            System.out.println("File location: " + file.getPath());
            System.out.println("File absoulute path: " + file.getAbsolutePath());
            System.out.println("File read privilege: " + file.canRead());
            System.out.println("File write privilege: " + file.canWrite());
            System.out.println("File execute privilege: " + file.canExecute());
        }catch (IOException e){

        }
    }
}