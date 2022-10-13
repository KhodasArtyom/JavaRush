package Interfaces.Task7;

public class Solution {
    public static void main(String[] args) {
        StringObject stringObject = new StringObject();
        stringObject.getInstance();

    }

    static class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;

        }
    }
}
