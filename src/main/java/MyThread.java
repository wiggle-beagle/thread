public class MyThread extends Thread {

    MyThread(ThreadGroup tg, String name) {
        super(tg, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2000);
                System.out.println("Я поток " + Thread.currentThread().getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
        }

    }
}

