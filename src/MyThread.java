public class MyThread implements Runnable{

    public void run() {
        for (int i = 1; i < 11; i++)
        {
            System.out.println(i + "\t");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        }
    }
}

/* Ответ на вопрос
*
* Вывод двух потоков может быть премешан, так как они выполняются одновременно и пока один не запущен,
* работает другой. Когда мы останавливаем поток 0 на 500 мс, начинает работать поток 1.
* */