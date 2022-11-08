package StringClass.Substring.Task1;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения JAVA"));

    }

    public static String getPartOfString(String string) {
        if(string == null) {
            throw new TooShortStringException();
        }
        String[] splitWithSpaces = string.split(" ");

        if(splitWithSpaces.length < 5) {
            throw new TooShortStringException();
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 5 ; i++) {
            stringBuilder.append(splitWithSpaces[i]);
            stringBuilder.append(" ");

        }
    return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {

    }

}
