public class Main {
    public static void main(String[] args) {
        // 1 Task

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Все потоки завершены.");


//-----------------------------------------------------------------------------------------------
        // 2 Task

        SyncThread syncThread1 = new SyncThread(Counter.counter);
        SyncThread syncThread2 = new SyncThread(Counter.counter);

        Thread thread11 = new Thread(syncThread1);
        Thread thread22 = new Thread(syncThread2);

        thread11.start();
        thread22.start();

        try {
            thread11.join();
            thread22.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Все потоки завершены. Итоговое значение count = "+ Counter.GetIncrement());
    }
}