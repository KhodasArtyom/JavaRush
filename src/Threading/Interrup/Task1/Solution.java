package Threading.Interrup.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(in);

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        bufferedReader.readLine();
        stopWatch.interrupt();
        bufferedReader.close();
        in.close();


    }

    public static class StopWatch extends Thread {
        private int seconds;

        @Override
        public void run() {

            try {
                Thread current = Thread.currentThread();
                while (!current.isInterrupted()) {
                    Thread.sleep(1000);
                    seconds++;
                }
            }catch (InterruptedException e) {
                System.out.println(seconds
                );
            }
        }
    }
}
