package Threading;

public class Printer implements Runnable {

    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + this.name);
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer("Коля");
        Thread thread1 = new Thread(printer);
        thread1.start();


        Printer printer1 = new Printer("Саша");
        Thread thread2 = new Thread(printer1);
        thread2.start();


    }
}
