package br.com.devdojo.beans;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class StudentRegisterBean implements Serializable {

    private String name = "Bruce";
    private String lastName = "Cristal";
    private double age = 29;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public StudentRegisterBean() {
    }
}
