package br.com.java.marathon.oo.domain;


import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import static java.util.Objects.nonNull;

public class Employee {
    private String name;
    private int age;
    private double[] salaries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public void employeeReport(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Register: " + currentTimeMillis());

        if(nonNull(salaries)){
            for(double salary : salaries){
                System.out.println(format("Salary: %s", salary));
            }
            employeeAverageSalaryCalculator();
        }
    }

    public void employeeAverageSalaryCalculator(){
        double average = 0;
        for(double salary : salaries){
            average += salary;
        }
        average /= salaries.length;

        System.out.println(format("average salary is $ %s", average));
    }

}
