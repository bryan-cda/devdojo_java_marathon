package br.com.functional.programming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Iterating {
    public static void main(String[] args) {
        String[] approvedNames = {"John", "Cora", "Zion", "Joe"};
        List<String> colors = asList("Blue", "Black", "White", "Yellow");

        Stream.of(approvedNames)
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println);

        String j = Stream.of(approvedNames)
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.joining());
        System.out.println(j);

        colors.stream()
                .map(color -> color.concat("-verified."))
                .forEach(System.out::println);

    }
}
