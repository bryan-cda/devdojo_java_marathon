package br.com.java.marathon.arrays;

import br.com.java.marathon.calculator.Calculator;

import static java.lang.String.valueOf;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(args);

        //simple int array - arrays is reference types not primitive
        int[] ages = new int[3];
        ages[0] = 3;
        ages[1] = 30;
        ages[2] = 32;

        //simple String array
        String[] names = new String[4];
        names[0] = "None";
        names[1] = "John";
        names[2] = "Due";
        names[3] = "Foo";

        //other ways to create an array
        int[] numbers = {1, 2, 3};

        int[] digits = new int[]{1, 2, 3};

        //foreach to display elements in an array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //other foreach method
        for (int number : numbers) {
            System.out.println(number);
        }

        for (int digit : digits) {
            System.out.println(digit);
        }

        //display elements for index in an array
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        //create bi-dimensional arrays
        int[][] year = new int[12][31];

        year[0][0] = 1;
        year[0][1] = 2;
        year[0][2] = 3;
        year[0][3] = 4;
        year[0][4] = 5;
        year[0][5] = 6;
        year[0][6] = 7;
        year[0][7] = 8;
        year[0][8] = 9;
        year[0][9] = 10;
        year[0][10] = 11;
        year[0][11] = 12;
        year[0][12] = 13;
        year[0][13] = 14;
        year[0][14] = 15;
        year[0][15] = 16;
        year[0][16] = 17;
        year[0][17] = 18;
        year[0][18] = 19;
        year[0][19] = 20;
        year[0][20] = 21;
        year[0][21] = 22;
        year[0][22] = 23;
        year[0][23] = 24;
        year[0][24] = 25;
        year[0][25] = 26;
        year[0][26] = 27;
        year[0][27] = 28;
        year[0][28] = 29;
        year[0][29] = 30;
        year[0][30] = 31;

        for (int i = 0; i < year[0].length; i++) {
            String day = "";
            if (year[0][i] < 10) {
                day = "0" + year[0][i];
            } else {
                day = valueOf(year[0][i]);
            }

            System.out.println("Janeiro - " + day + "/01");
        }

        int[][] modelArray = new int[3][]; // [][][]

        modelArray[0] = new int[1];
        modelArray[1] = new int[2];
        modelArray[2] = new int[3];

        char[][] languages = new char[2][4];

        languages[0][0] = 'J';
        languages[0][1] = 'A';
        languages[0][2] = 'V';
        languages[0][3] = 'A';

        for (char[] language : languages) {
            for (char lang : language) {
                System.out.print(lang);
                System.out.println();
            }
        }

        int[][] testNullArray = new int[3][];

        testNullArray[0] = new int[2];
        testNullArray[1] = new int[2];
        testNullArray[2] = new int[2];

        for (int[] array : testNullArray) {
            for (int some : array) {
                System.out.println("test null array: " + some);
                System.out.println();
            }
        }

        System.out.printf(Calculator.class.getName() + ":::sumArray = ");
        Calculator calc = new Calculator();
        int[] arr = {year[0][0], year[0][1], year[0][2]};
        calc.sumArray(arr);

        System.out.printf(Calculator.class.getName() + ":::sumArrayVarArgs = ");
        calc.sumArrayVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }
}
