package OOP.Polimorfism.Task2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

public static String getObjectType(Object object) {
    if (object instanceof Cow) {
        return "Корова";
    }
    if (object instanceof Dog) {
        return "Собака";
    }
    if(object instanceof Whale) {
        return "Кит";
    }
    if(object instanceof Pig) {
        return "Свинка";
    }

    return "Неизветсное животное";
}
public static class Cow {

}

public static class Dog{
}

public static class Whale {
}

public static class Pig {
}
}
