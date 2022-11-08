package StringClass.Substring.Task2;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения JAVA\t"));

    }
    public static String getPartOfString(String string) throws TooShortStringException{
        if(string==null) {
            throw new TooShortStringException();
        }
        String[] splitWIthTabs = string.split("\\t");

        if(splitWIthTabs.length < 3) throw new TooShortStringException();
        return splitWIthTabs[1];
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
