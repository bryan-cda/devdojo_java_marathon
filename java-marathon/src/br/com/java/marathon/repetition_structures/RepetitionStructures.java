package br.com.java.marathon.repetition_structures;

public class RepetitionStructures {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10){
            System.out.println(++count);
        }

        do{
            System.out.println("inside of do while");
        } while (count > 10);

        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 0; i < 1000000; i++){
            if(i == 888888){
                System.out.println("Here!");
                break;
            } else if (i % 2 == 0){
                System.out.println(String.format("Pair: %s", i));
            }
        }
    }
}
