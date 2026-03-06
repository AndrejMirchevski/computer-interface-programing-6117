public class AThread extends Thread{
    private int counter = 10;
    private static int threadCounter = 0;
    private int threadNumber = ++ threadCounter;

    public AThread(){
        System.out.println("Created thread with number: " + threadNumber);
    }
    @Override
    public void run() {
        while (true){
            System.out.println("thread " + threadNumber + "(" + counter + ")");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            counter--;
            if(counter == 0){
                return;
            }
        }
    }
}
