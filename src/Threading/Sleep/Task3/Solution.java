package Threading.Sleep.Task3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<String> list = new ArrayList<>(5);

    static {
        for(int i =0;i <5;i ++) {
            list.add("Строка " + i);
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new CountDown(3), "CountDown");
        thread.start();

    }

    public static class CountDown implements Runnable {
        private int countFrom;

        public CountDown(int countFrom) {
            this.countFrom = countFrom;
        }

        @Override
        public void run() {
            try {
                while ((countFrom > 0)) {
                    printCountDown();
                }
            }catch (InterruptedException e){
                System.out.println(e.getStackTrace());
            }

        }

        public void printCountDown() throws InterruptedException {
            countFrom--;
            Thread.sleep(500);
            System.out.println(list.get(countFrom));
        }
    }




}
