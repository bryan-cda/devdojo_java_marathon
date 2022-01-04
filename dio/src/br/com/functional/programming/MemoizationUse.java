package br.com.functional.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MemoizationUse {

    public static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        long beginTimeWithMemorization = System.nanoTime();
        System.out.println("Init time factorial with memorization: " + beginTimeWithMemorization);
        System.out.println(factorialWithMemorization(20));
        long endTimeFactorialWithMemoization = System.nanoTime();
        System.out.println("End time factorial with memorization: "+ endTimeFactorialWithMemoization);
        long totalTimeWithMemorization = endTimeFactorialWithMemoization - beginTimeWithMemorization;
        long totalSecondsWithMemorization = TimeUnit.SECONDS.convert(totalTimeWithMemorization, TimeUnit.NANOSECONDS);
        System.out.println(totalTimeWithMemorization + " milliseconds");
        System.out.println(totalSecondsWithMemorization + " seconds");

        long beginTimeNormalFactorial = System.nanoTime();
        System.out.println("Init time normal factorial: " + beginTimeNormalFactorial);
        System.out.println(fact(20));
        long endTimeNormalFactorial = System.nanoTime();
        System.out.println("End time factorial with memorization: "+ endTimeNormalFactorial);
        long totalNormalTime = endTimeNormalFactorial - beginTimeNormalFactorial;
        long totalNormalSeconds = TimeUnit.SECONDS.convert(totalNormalTime, TimeUnit.NANOSECONDS);
        System.out.println(totalNormalTime + " milliseconds");
        System.out.println(totalNormalSeconds + " seconds");

    }
    public static Integer factorialWithMemorization(Integer value){
        if(value == 1){
            return value;
        }else {
            if(cache.containsKey(value)){
                return cache.get(value);
            } else{
                Integer result = value * factorialWithMemorization(value -1);
                cache.put(value, result);
                return result;
            }
        }
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
