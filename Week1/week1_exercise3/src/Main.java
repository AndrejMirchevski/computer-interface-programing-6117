import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Path dirPath = Paths.get("Week1/src");
        String ext = ".java";

        try {
            DirectoryStream<Path> files = Files.newDirectoryStream(dirPath, "*" + ext);
            for(Path f : files){
                System.out.println(f);
            }
        }catch (IOException e){

        }
    }
}