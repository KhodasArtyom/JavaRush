package Threading;

public class Man extends Thread{

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("I'm " + this.name);
    }

    public static void main(String[] args) {
        Man man1 = new Man("Вася");
        man1.start();

        Man man2 = new Man("Никита");
        man2.start();

        man1.start();
    }
}
