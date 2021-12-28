package br.com.functional.programming;

public class TailRecursion {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(String.format("Fibonacci of %s is = ", number) + fibonacci(number,0,1));

        System.out.println(String.format("Factorial of %s is = ", number) + fact(number));
    }

    static int fibonacci(int n, int a, int b )
    {
        if (n == 0)
            return a;
        if (n == 1)
            return b;
        return fibonacci(n - 1, b, a + b);
    }

    static int factTR(int n, int a)
    {
        if (n == 0)
            return a;

        return factTR(n - 1, n * a);
    }

    static int fact(int n)
    {
        return factTR(n, 1);
    }
}
