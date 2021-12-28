package br.com.functional.programming;

import static java.lang.System.out;
import static java.util.Arrays.stream;

public class FunctionCompositionUse {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //Imperative mode
        for(int i = 0; i < numbers.length; i++){
            if(i % 2 == 0 && i > 0){
                System.out.println(printMessage("pair", i));
            } else{
                if(i > 0){
                    System.out.println(printMessage("odd", i));
                }
            }
        }

        //Functional mode
        stream(numbers)
                .forEach(number -> out.println(printMessage(number % 2 == 0 ? "pair" : "odd", number)));
    }

    public static String printMessage(String term, int number){
        return String.format("Number [%s] is %s", number, term);
    }
}
