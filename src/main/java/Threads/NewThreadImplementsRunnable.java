package Threads;

public class NewThread implements Runnable{
    Thread t;

    NewThread() {
        // Создать новый, второй поток.
        t = new Thread(this, "Demo Thread");
        System.out.println("Дочерний поток: " + t);
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Sub thread: " + t);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread broken");
        }
        System.out.println("Finish sub thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread broken");
        }
        System.out.println("Finish main thread");
    }
}
