package br.com.functional.programming;

import java.util.function.Predicate;

public class PredicateUse {
    public static void main(String[] args) {
        Predicate<Integer> isLowerThanTwo = number -> number < 2;
        System.out.println(isLowerThanTwo.test(1));
        System.out.println(isLowerThanTwo.test(2));

        Predicate<String> isEmpty = String::isEmpty;
        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test("foo"));
        System.out.println(!isEmpty.test("bar"));
    }
}
