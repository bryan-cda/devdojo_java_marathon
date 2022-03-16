package br.com.java.marathon.conditionals_structures;

import java.util.Scanner;

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
