package Threading;

public class Iphone implements Runnable{
    private String name;

    public Iphone(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The new process in Iphone started to work " + this.name);
    }

    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 13 Pro Max");

        Thread thread1 = new Thread(iphone);
        thread1.start();

        Thread thread2 = new Thread(iphone);
        thread2.start();

        Thread thread3 = new Thread(iphone);
        thread3.start();

    }
}
