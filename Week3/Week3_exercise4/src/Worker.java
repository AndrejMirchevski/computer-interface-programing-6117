public class Worker implements Runnable{
    private String message;

    public Worker(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (start) " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (end) " + message);
    }

    public void processMessage(){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
