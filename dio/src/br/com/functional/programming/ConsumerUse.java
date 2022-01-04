package br.com.functional.programming;

import java.util.function.Consumer;

public class ConsumerUse {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        print.accept("Hello!");

        Consumer<String> concat = term -> System.out.println(term.concat("bar"));
        String term = "foo";
        concat.accept(term);
    }
}
