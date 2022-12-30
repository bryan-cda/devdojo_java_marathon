package br.com.java.marathon.oo.domain;

public class StudentPrinter {
    public void printStudentData(Student student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
