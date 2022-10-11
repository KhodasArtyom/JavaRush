package OOP.Polimorfism.MethodsReloading.Task1;

public class Solution {
    public static void main(String[] args) {
        System.out.println();print(3);
        print(1);

    }
    public static void print(int value) {
        System.out.println(value);

    }

    public static void print(Integer integer) {
        System.out.println(integer);

    }


}
