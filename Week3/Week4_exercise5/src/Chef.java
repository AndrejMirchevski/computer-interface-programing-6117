public class Chef implements Runnable{
    private String[] specialites;
    private String name;
    private ServingCounter servingCounter;

    public Chef(String[] specialites, String name, ServingCounter servingCounter) {
        this.specialites = specialites;
        this.name = name;
        this.servingCounter = servingCounter;
    }

    @Override
    public void run() {
        while (true){
            String dish = specialites[(int)Math.random() * specialites.length];
            try{
                Thread.sleep(1000);
                servingCounter.addDish(name, dish);
                System.out.println("chef added " + dish + " to the counter");

            }catch (InterruptedException e){
                System.out.println("Chef is going home");
            }
        }
    }
}
