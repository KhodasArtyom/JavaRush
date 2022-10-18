package Threading.Sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            Thread.sleep(10);
            System.out.println("Tik");
        }
    }
}
