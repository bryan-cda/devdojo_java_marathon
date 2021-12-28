package br.com.functional.programming;

import java.util.HashMap;
import java.util.Map;

public class MemorizationUse {

    public static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        long beginTime = System.nanoTime();
        System.out.println(factorialWithMemorization(5));
        System.out.println(beginTime);
        long endTime = System.nanoTime();
        System.out.println(endTime);
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
}
