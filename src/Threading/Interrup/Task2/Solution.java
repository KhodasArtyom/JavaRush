package Threading.Interrup.Task2;

public class Solution {
    public static volatile int numSeconds = 3 ;
    public static void main(String[] args) throws InterruptedException {
        RacingClock racingClock = new RacingClock();
        Thread.sleep(3500);
        racingClock.interrupt();

    }


    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        @Override
        public void run() {
            try {
                while(!isInterrupted() && numSeconds >=0) {
                    if(numSeconds==0) {
                        System.out.println("GO!!!!");
                    }else {
                        System.out.println(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }
            } catch (InterruptedException e) {
                if(numSeconds != -1  ) {
                    System.out.println("Прервано");
                }
            }
        }
    }
}

