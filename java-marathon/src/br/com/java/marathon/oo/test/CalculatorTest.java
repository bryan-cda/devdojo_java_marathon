package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1,1));
        System.out.println(calc.subtraction(1,1));
        System.out.println(calc.multiply(2,2));
        System.out.println(calc.division(10,0));
        int[] array = {1,2,3,4,5};
        System.out.println(calc.sumArray(array));
        System.out.println(calc.sumArrayVarArgs(array));
    }
}
