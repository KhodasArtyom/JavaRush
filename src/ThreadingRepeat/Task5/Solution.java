package ThreadingRepeat.Task5;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> list = new ArrayList<>(5);
    static {
        list.add(new Thread1());
        list.add(new Thread2());
        list.add(new Thread3());
        list.add(new Thread4());
        list.add(new Thread5());
    }

    public static void main(String[] args) {

    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while(true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e)    {
                System.out.println(e);
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            System.out.println("Ура");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while(!isInterrupted()) {
            }
        }
        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread{
        @Override
        public void run() {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            while (true) {
                try {
                    String str = bufferedReader.readLine();
                    if(str.equals("N"))
                        break;
                    sum+=Integer.parseInt(str);
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sum);
        }
    }



}
