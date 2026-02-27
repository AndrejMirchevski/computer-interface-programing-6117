import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }

        try {
            Desktop desktop = Desktop.getDesktop();
            //File file = new File("uniqueFile_1771607903319.txt");
            //desktop.open(file);

            URI uri = URI.create("mailto:amircevski@gmail.com?subject=Test&body=Something");
            desktop.mail(uri);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}