package br.com.java.marathon.conditionals_structures;

import java.util.Scanner;

public class ConditionalStructures {
    static String category;

    public static final String VIP_CLIENT = "VIP CLIENT";
    public static final String NORMAL_CLIENT = "NORMAL CLIENT";

    public static void main(String[] args) {
        int age = 18;

        if (age == 17)
            System.out.println(age);

        boolean allowedToBuyAlcohol = age >= 18;

        if(allowedToBuyAlcohol){
            System.out.println("Allowed to buy alcohol!");
        } else{
            System.out.println("Not allowed to buy alcohol!");
        }

        if(age < 15){
            category = "Children's category";
        } else if(age >= 15 && age <= 18){
            category = "Juvenile category";
        } else{
            category = "Adult category";
        }
        System.out.println(category);

        double salary = 4000;

        boolean clientType = salary > 5000;

        String bankClient = clientType ? VIP_CLIENT : NORMAL_CLIENT;

        System.out.println(bankClient);

        age ++;

        category = age < 15 ? "Children's category"
                : age >= 15 && age < 18 ? "Juvenile category"
                : "Adult category";

        System.out.println(category);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the week day number?");
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thursday ");
                break;
            case 3:
                System.out.println("Wednesday ");
                break;
            case 4:
                System.out.println("Tuesday ");
                break;
            case 5:
                System.out.println("Friday ");
                break;
            case 6:
                System.out.println("Saturday ");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
