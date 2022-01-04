package br.com.functional.programming;

public class HighOrderFunctionUse {
    public static void main(String[] args) {
        Calculator sum = (a,b) -> a + b;
        Calculator multiplication = (a,b) -> a * b;
        Calculator division = (a,b) -> a / b;
        Calculator subtraction = (a,b) -> a - b;

        System.out.println(calculatorHighOrderFunction(sum, 12, 7));
        System.out.println(calculatorHighOrderFunction(multiplication, 12, 7));
        System.out.println(calculatorHighOrderFunction(division, 12, 7));
        System.out.println(calculatorHighOrderFunction(subtraction, 12, 7));
    }

    public static int calculatorHighOrderFunction(Calculator calc, int a, int b){
        return calc.calc(a,b);
    }
}

interface Calculator{
    int calc(int a, int b);
}