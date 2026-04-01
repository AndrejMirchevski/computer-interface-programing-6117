import java.io.PrintWriter;

public class Convetor implements Runnable{

    public final String word;
    public final PrintWriter out;

    public Convetor(String word,PrintWriter out) {
        this.word = word;
        this.out = out;
    }

    @Override
    public void run() {
        String threadNumber = Thread.currentThread().getName();
        System.out.println("thread number: " + threadNumber + " is converting....");

        System.out.println("Thread number: " + threadNumber + " convered: " + convertedWord(word));
    }

    public static String convertedWord(String word){

        return word;
    };
}


