package br.com.java.marathon.arrays;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(args);

        int[] ages = new int[3];
        ages[0] = 3;
        ages[1] = 30;
        ages[2] = 32;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
    }

    class testArrays{
        public static void main(String[] args) {
            Arrays arrays = new Arrays();
            arrays.main(new String[]{"test"});
        }
    }
}
