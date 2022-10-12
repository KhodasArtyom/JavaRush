package Interfaces.Task4;

public class Solution {
    public static void main(String[] args) {

    }

    interface Selectable {
        void onSelect();

    }

    interface Updatable  {
        void refresh();

    }

    class Screen implements Selectable,Updatable {

        @Override
        public void onSelect() {

        }

        @Override
        public void refresh() {

        }
    }


}
