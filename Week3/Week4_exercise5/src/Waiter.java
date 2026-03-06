public class Waiter implements Runnable{
    private ServingCounter servingCounter;
    private String name;

    public Waiter(String name, ServingCounter servingCounter) {
        this.name = name;
        this.servingCounter = servingCounter;
    }

    @Override
    public void run() {
        while (true){

            try{
                String dish = servingCounter.takeDish(name);

                System.out.println("serving the dish to the customer");
                Thread.sleep(1000);
                System.out.println("Waiter" + name + " deliverd " + dish + " To the customer");

            }catch (InterruptedException e){
                System.out.println("Chef is going home");
            }
        }
    }
}
