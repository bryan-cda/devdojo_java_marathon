package br.com.functional.programming;

public class RecursionStackOverflowErrorUse {
    //StackOverflow error
    public static int factorial(int n){
        if(n == 1){
            return n;
        } else{
            return  n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
}

