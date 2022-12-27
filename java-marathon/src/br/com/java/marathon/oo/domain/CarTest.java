package br.com.java.marathon.oo.domain;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Mustang";
        car1.model = "Sport";
        car1.year = 1988;

        car2.name = "White Mustang";
        car2.model = "Sport X";
        car2.year = 1989;

        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
     }
}
