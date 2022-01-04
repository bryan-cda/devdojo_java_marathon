package br.com.functional.programming;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterating {
    public static void main(String[] args) {
        String[] approvedNames = {"John", "Cora", "Zion", "Joe"};

        Stream.of(approvedNames)
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);

        String j = Stream.of(approvedNames)
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.joining());

        System.out.println(j);
    }
}
