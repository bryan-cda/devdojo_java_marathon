package br.com.java.marathon.oo.domain;

public class Calculator {
    public int sum(int n1, int n2){
        return (n1 + n2);
    }

    public int subtraction(int n1, int n2){
        return (n1 - n2);
    }

    public int multiply(int n1, int n2){
        return (n1 * n2);
    }

    public int division(int n1, int n2){
        return n2 == 0 ? 0 : (n1/n2);
    }

    public int sumArray(int[] numbers){
        int total = 0;

        for(int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }

    public int sumArrayVarArgs(int... numbers){
        int total = 0;

        for(int i = 0; i < numbers.length; i++){
            total += numbers[i];
        }
        return total;
    }
}
