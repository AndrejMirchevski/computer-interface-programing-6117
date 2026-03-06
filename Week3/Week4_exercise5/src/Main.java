// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ServingCounter servingCounter = new ServingCounter(5);
        Thread thread1 = new Thread(new Chef(new String[] {"pizza", "pasta"}, "Chef1", servingCounter));
        Thread thread2 = new Thread(new Chef(new String[] {"Burher", "Steak"}, "chef2", servingCounter));

        Thread thread3 = new Thread(new Waiter("Waiter1", servingCounter));
        Thread thread4 = new Thread(new Waiter("Waiter2", servingCounter));

        thread1.start();
        thread2.start();

        thread3.start();
        thread4.start();


        try {
            Thread.sleep(15000);
        }catch (InterruptedException e){
            System.out.println("Restaurant is closing");
            System.exit(0);
        }
    }
}