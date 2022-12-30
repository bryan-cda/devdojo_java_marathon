package br.com.java.marathon.oo.domain;

import java.util.Objects;

import static java.lang.String.format;
import static java.util.Objects.nonNull;

public class Employee {
    public String name;
    public int age;
    public double[] salaries;

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
