package br.com.java.marathon.oo.domain;

public class Student {
    private String name;
    private char gender;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public char getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

    // -- it's not good to use this method for cohesion question
    public void printStudentData(){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.age);
    }
}
