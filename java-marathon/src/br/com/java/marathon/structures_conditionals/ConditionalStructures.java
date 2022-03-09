package br.com.java.marathon.structures_conditionals;

public class ConditionalStructures {
    public static void main(String[] args) {
        int age = 17;

        boolean isAllowedToBuyAlcohol = age > 18;

        if(isAllowedToBuyAlcohol){
            System.out.println("Allowed to buy alcohol!");
        } else{
            System.out.println("Not allowed to buy alcohol!");
        }

        String category;

        if(age < 15){
            category = "Children's category";
        } else if(age >= 15 && age < 18){
            category = "Juvenile category";
        } else{
            category = "Adult category";
        }

        System.out.println(category);
    }
}
