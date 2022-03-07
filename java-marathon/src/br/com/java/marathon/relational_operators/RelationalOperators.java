package br.com.java.marathon.relational_operators;

import java.util.Scanner;

import static java.lang.String.format;

public class RelationalOperators {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the selected number?");
        Integer selectedNumber = scanner.nextInt();

        //Rest and relational operators use
        System.out.println(selectedNumber % 3 > 1
                && selectedNumber / 2 > 1
                || selectedNumber - num1 > 1
                ? format("Is rest %s major than 1", selectedNumber % 3)
                : format("Is rest %s lower or equal to 1", (selectedNumber % 3))
        );
    }
}
