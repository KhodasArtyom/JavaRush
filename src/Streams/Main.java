package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        /*Stream<String> stream = list.stream();
        stream.forEach(x-> System.out.println(x));*/
        list.stream().forEach(x-> System.out.println(x));
        Set<String> set = list.stream().filter(x -> x.equals("one")).collect(Collectors.toSet());
        list.stream().map(x->x.toUpperCase());
        //Старайся дальше


    }

}
