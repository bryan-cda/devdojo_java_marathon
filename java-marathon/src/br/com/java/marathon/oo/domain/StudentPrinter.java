package br.com.java.marathon.oo.domain;

public class StudentPrinter {
    public void printStudentData(Student student){
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.gender);
    }

}
