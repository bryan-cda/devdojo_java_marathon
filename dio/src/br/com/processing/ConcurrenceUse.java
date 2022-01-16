package br.com.processing;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ConcurrenceUse {
    public static void main(String[] args) {
        long init = System.nanoTime();
        IntStream.range(1,10).forEach(n -> factorial(n));
        long end = System.nanoTime();
        System.out.println(String.format("Time elapsed: %s", end-init));


        long  initParallel= System.nanoTime();
        IntStream.range(1,10).parallel().forEach(n -> factorial(n));
        long endParallel = System.nanoTime();
        System.out.println(String.format("Time elapsed: %s", endParallel-initParallel));
    }

    public static long factorial(long number){
        long fat = 1;
        for(long i = 2; i < number; i++){
            fat *= i;
        }
        return fat;
    }
}

