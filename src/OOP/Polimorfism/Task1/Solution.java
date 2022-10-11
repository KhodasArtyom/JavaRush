package OOP.Polimorfism.Task1;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Dog());
        printObjectType(new Bird());
        printObjectType(new Lamp());


    }
    public static void printObjectType(Object object) {
        if(object instanceof Cat) {
            System.out.println("Кошка");
        }if(object instanceof Dog) {
            System.out.println("Собака");
        }if (object instanceof Bird) {
            System.out.println("Птица");
        } if (object instanceof  Lamp) {
            System.out.println("Лампа");
        }
    }



public static class Cat{

}

public static class Dog {

}

public static class Bird {

}

public static class Lamp {

}
}

