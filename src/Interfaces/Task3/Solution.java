package Interfaces.Task3;

public class Solution {
    public static void main(String[] args) {
        print(new Beer());
        print(new Cola());

    }

private static void print(Drink drink) {
    System.out.println(drink.getClass().getSimpleName());
}
public static class Beer implements Drink{
    @Override
    public boolean isAlcoholic() {
        return true;
    }
}

public static class Cola implements Drink {
    @Override
    public boolean isAlcoholic() {
        return false;
    }
}

}
