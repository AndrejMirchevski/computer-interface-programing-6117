import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            executor.execute(new Worker("local thread " + i));
        }

        executor.shutdown();
        while (!executor.isTerminated()){
            //wait till the executor is not terminated
            //System.out.println("waiting.....");
        }
        System.out.println("all threads are ended");
    }
}