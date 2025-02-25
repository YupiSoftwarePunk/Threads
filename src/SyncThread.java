public class SyncThread implements Runnable{

    private static Counter counter;

    public SyncThread(Counter counter1){
        this.counter = counter1;
    }


    public void run() {
        for (int i = 0; i < 1000; i++){
            Counter.increment();
        }
    }
}
