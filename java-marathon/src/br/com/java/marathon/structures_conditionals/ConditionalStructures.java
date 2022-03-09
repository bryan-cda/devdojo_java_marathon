package br.com.java.marathon.structures_conditionals;

public class ConditionalStructures {
    static String category;

    public static void main(String[] args) {
        int age = 17;

        boolean isAllowedToBuyAlcohol = age > 18;

        if(isAllowedToBuyAlcohol){
            System.out.println("Allowed to buy alcohol!");
        } else{
            System.out.println("Not allowed to buy alcohol!");
        }

        if(age < 15){
            category = "Children's category";
        } else if(age >= 15 && age < 18){
            category = "Juvenile category";
        } else{
            category = "Adult category";
        }
        System.out.println(category);

        double salary = 4000;

        String bankClient = salary > 5000 ? "VIP CLIENT" : "NORMAL CLIENT";

        System.out.println(bankClient);

        age ++;

        category = age < 15 ? "Children's category" : age >= 15 && age < 18 ? "Juvenile category" : "Adult category";

        System.out.println(category);
    }
}
