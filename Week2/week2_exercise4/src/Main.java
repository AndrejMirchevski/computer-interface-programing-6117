import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String urlString = "https://github.com";
        String filePathString = "Week2/downloadContent2.html";
        downloadContent(urlString, filePathString);
        try {
            InputStream inputStream = new BufferedInputStream(new URL(urlString).openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(filePathString);

            byte[] bufferData = new byte[1024];
            int dataRead;

            while ((dataRead = inputStream.read(bufferData, 0, bufferData.length)) != -1) {
                fileOutputStream.write(bufferData, 0, dataRead);
            }

            System.out.println("Downloading finished");
        }catch (MalformedURLException e){
            e.printStackTrace();}
        catch (IOException e){
            e.printStackTrace();
        }
   }

   public static void downloadContent(String ulrString, String filePath){
       try {
           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(ulrString).openStream()));
           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
           String line;

           while ((line = bufferedReader.readLine()) != null){
               bufferedWriter.write(line);
               bufferedWriter.newLine();
           }
           System.out.println("Finished another download");

       }catch (MalformedURLException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
   }
}
