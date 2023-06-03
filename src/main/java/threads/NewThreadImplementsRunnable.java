package threads;

public class NewThreadImplementsRunnable implements Runnable{
    String name;    // имя потока
    Thread t;

    NewThreadImplementsRunnable(String threadname) {
        // Создать новый, второй поток.
        name = threadname;
        t = new Thread(this, name);
        System.out.println("Новый поток: " + t);
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + t);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " broken");
        }
        System.out.println(name + " thread");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        NewThreadImplementsRunnable nt1 = new NewThreadImplementsRunnable("One");
        NewThreadImplementsRunnable nt2 = new NewThreadImplementsRunnable("Two");
        NewThreadImplementsRunnable nt3 = new NewThreadImplementsRunnable("Three");
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread ONE don't work: " + nt1.t.isAlive());
        System.out.println("Thread TWO don't work: " + nt2.t.isAlive());
        System.out.println("Thread THREE don't work: " + nt3.t.isAlive());


        try {
            System.out.println("Wait when other threads finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
            // Ожидать окончания остальных потоков.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread broken");
        }
        System.out.println("Thread ONE work: " + nt1.t.isAlive());
        System.out.println("Thread TWO work: " + nt2.t.isAlive());
        System.out.println("Thread THREE work: " + nt3.t.isAlive());
        System.out.println("Finish main thread");
    }
}
