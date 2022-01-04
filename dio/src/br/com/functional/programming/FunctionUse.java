package br.com.functional.programming;

import java.util.function.Function;

public class FunctionUse {
    public static void main(String[] args) {
        Function<String, String> reverse = text -> new StringBuilder(text).reverse().toString();
        String fooBar = reverse.apply("foo bar");
        System.out.println(fooBar);

        Function<String, Integer> integerValueOf = string -> Integer.valueOf(string);
        Integer integer = integerValueOf.apply("12");
        System.out.println(integer);

    }
}
