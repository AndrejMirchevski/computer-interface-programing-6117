import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            URI uri = URI.create("http://uacs.edu.mk/home/home");
            URL url = uri.toURL();

            System.out.println(url.getAuthority());
            System.out.println("Path: " + url.getPath());
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Default port: " + url.getDefaultPort());
            System.out.println(url.getQuery());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}