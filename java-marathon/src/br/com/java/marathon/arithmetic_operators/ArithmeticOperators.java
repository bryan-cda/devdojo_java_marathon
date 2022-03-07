package br.com.java.marathon.arithmetic_operators;

import java.util.Scanner;

import static java.lang.String.format;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //Arithmetic operators
        int num1 = 20;
        int num2 = 10;

        System.out.println("Multiplication: " + num1 * num2);
        System.out.println("Sum:" + num1 + num2);
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Division: " + (num1 - num2));

        //Cast to double
        double result = (double) num2 / num1;
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the selected number?");
        Integer selectedNumber = scanner.nextInt();


        //Rest and relational operators use
        System.out.println(selectedNumber % 3 > 1
                && selectedNumber / 2 > 1
                || selectedNumber - num1 > 1
                ? format("Is rest %s major than 1", selectedNumber % 3)
                : format("Is rest %s lower or equal to 1", (selectedNumber % 3))
        );


    }
}
