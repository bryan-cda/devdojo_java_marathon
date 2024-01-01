package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.methods.Calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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


        List<String> names = new ArrayList<>();
        names.add("Foo");
        names.add("Bar");
        names.add("John");
        names.add("Due");

        names.forEach(n -> System.out.println(n.contains("Foo") || n.contains("Bar")));

        BigDecimal price = new BigDecimal("10.12556");
        price = price.setScale(2, BigDecimal.ROUND_DOWN);

        System.out.println(price);
    }
}
