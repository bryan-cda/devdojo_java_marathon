package br.com.functional.programming;

import java.util.function.UnaryOperator;

public class UnaryOperatorUse {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        UnaryOperator<Integer> result = number -> multiply(number, 3);
        System.out.println(result.apply(3));
    }

    public static Integer multiply(Integer number, Integer multiplyFor){
        return number * multiplyFor;
    }
}
