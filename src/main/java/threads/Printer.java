package threads;

public class Printer implements Runnable{
    private String name;
    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + this.name);
    }

    public static void main(String[] args) {
        Printer printer1 = new Printer("John");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer printer2 = new Printer("Bob");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }


}
