package OOP.Polimorfism.MethodsReloading.Task3;

public class Solution {
    public static void main(String[] args) {
        min(3,5);
        min(5,10);
        min(8,3);

    }
public static int min(int a,int b) {
        return a < b ? a : b;
}

public static long min(long a,long b) {
        return a < b ? a : b;
}

public static double min(double a, double b) {
         return a <b ?a :b;
}
}
