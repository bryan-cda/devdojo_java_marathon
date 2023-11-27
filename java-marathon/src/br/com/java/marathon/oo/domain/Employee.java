package br.com.java.marathon.oo.domain;


import static java.lang.String.format;
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

    public void printEmployeeSalaryData(){
        System.out.println(this.name);
        System.out.println(this.age);

        if(nonNull(salaries)){
            for(double salary : salaries){
                System.out.println(format("Salary: %s", salary));
            }
            printAverage();
        }
    }

    public void printAverage(){
        double average = 0;
        for(double salary : salaries){
            average += salary;
        }
        average /= salaries.length;

        System.out.println(format("average salary is: %s", average));
    }

}
