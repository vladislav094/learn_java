package Threads;

public class NewThreadExtendsThread extends Thread{
    NewThreadExtendsThread() {
        // Создать новый поток.
        super("Demo Thread");
        System.out.println("Дочерний поток: " + this);
    }
    // Точка входа второго потока.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дочерний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дочерний поток прерван");
        }
        System.out.println("Завершение дочернего потока");
    }
}

class ExtendThread {
    public static void main(String[] args) {
        NewThreadExtendsThread nt = new NewThreadExtendsThread();
        nt.start();
        try {
            for (int i = 5; i >0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }
        System.out.println("Завершение главного потока");
    }
}
