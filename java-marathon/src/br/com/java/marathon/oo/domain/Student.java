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

    /**
     *
     * @see just to example of this use
     * @author Bryan Duarte
     * @since 01.12.2023
     * @version 0.0.1
     * @apiNote it's not good to use this method for cohesion question

    public void printStudentData(){
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.age);
    } */


}
