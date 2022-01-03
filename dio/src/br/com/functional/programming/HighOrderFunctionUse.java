package br.com.functional.programming;

public class HighOrderFunctionUse {
    public static void main(String[] args) {
        Calculator calc = (a,b) -> a + b;

        System.out.println(calculatorHighOrderFunction(calc, 12, 7));
    }

    public static int calculatorHighOrderFunction(Calculator calc, int a, int b){
        return calc.calc(a,b);
    }
}

interface Calculator{
    int calc(int a, int b);
}