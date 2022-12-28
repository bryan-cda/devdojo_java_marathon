package br.com.java.marathon.oo.domain;

public class Student {
    public String name;
    public char gender;
    public int age;

    // -- it's not good to use this method for cohesion question
    public void printStudentData(){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.age);
    }
}
