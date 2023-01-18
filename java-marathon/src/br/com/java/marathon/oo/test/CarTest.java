package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setName("Mustang");
        car1.setModel("Sport");
        car1.setYear(1998);

        car2.setName("White Mustang");
        car2.setModel("Sport X");
        car2.setYear(1989);

        car2 = car1;

        System.out.println(car1.getName());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println(car2.getName());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());
     }
}
