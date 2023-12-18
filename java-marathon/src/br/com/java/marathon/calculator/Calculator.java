package br.com.java.marathon.calculator;

public class Calculator {
    public void sumArray(int[] arr){
        int sum = 0;

        for (int number : arr){
            sum += number;
        }

        System.out.println(sum);
    }

    public void sumArrayVarArgs(int... arr){
        int sum = 0;

        for (int number : arr){
            sum += number;
        }

        System.out.println(sum);
    }
}
