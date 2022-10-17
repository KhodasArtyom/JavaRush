package Threading.Task5.methodJoin;

public class Printer implements Runnable {
    private String name;

    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("Коля");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        thread1.join();
    }

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + this.name);
    }
}
