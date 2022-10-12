package Interfaces.Task2;

public class Solution {
    public static void main(String[] args) {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());

    }

    public static class AlcoholicBeer implements Drink {

        @Override
        public boolean isAlcoholic() {
            return true;
        }

        @Override
        public String toString() {
            if(isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }
    }
}
