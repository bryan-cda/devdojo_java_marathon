package br.com.java.marathon.structures_conditionals;

public class ConditionalStructures {
    public static void main(String[] args) {
        int age = 17;

        boolean isAllowedToBuyAlcohol = age > 18;

        if(isAllowedToBuyAlcohol){
            System.out.println("Allowed to buy alcohol!");
        }

        if(!isAllowedToBuyAlcohol){
            System.out.println("Not allowed to buy alcohol!");
        }
    }
}
