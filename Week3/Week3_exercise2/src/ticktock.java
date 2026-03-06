public class ticktock implements Runnable{
    private String name;
    private int rate;

    public ticktock(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("clock: " + name + "  Tick");

            try {
                Thread.sleep(rate);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("clock: " + name + "  Tack");

            try {
                Thread.sleep(rate);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
