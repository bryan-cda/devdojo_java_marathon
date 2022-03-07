package br.com.java.marathon.arithmetic_operators;

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
    }
}
