public class SharedObject {
    public int counter = 0;
    public synchronized void incrementCounter(){
        counter++;
    }
}
