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
        System.out.println(format("NAME: %s", this.name));
        System.out.println(format ("AGE: %s ", this.age));
        System.out.println(format("REGISTER: %s ", currentTimeMillis()));

        if(nonNull(salaries)){
            for(double salary : salaries){
                System.out.println(format("SALARY: %s", salary));
            }
            employeeAverageSalaryCalculator();
        }
    }

    public void employeeAverageSalaryCalculator(){
        double average = 0;

        for(double salary : salaries){
            average += salary;
        }

        if(salaries.length > 0 && nonNull(salaries)){
            average /= salaries.length;
        }

        System.out.println(format("AVERAGE SALARY IS R$ %s", average));
    }

}
