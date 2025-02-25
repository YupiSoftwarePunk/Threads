public class Counter {
    public static Counter counter;
    private static int count = 0;

    public static synchronized  void increment(){
        count ++;
    }

    public static int GetIncrement(){
        return count;
    }
}
