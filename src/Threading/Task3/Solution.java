package Threading.Task3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);
    public static void main(String[] args) {
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));


    }

    public static class SpecialThread implements Runnable {
        @Override
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }


}
