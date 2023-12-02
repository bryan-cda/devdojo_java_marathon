package br.com.java.marathon.oo.domain;

import static java.lang.String.valueOf;

public class StudentPrinter {
    public void printStudentData(Student student) {
//        student.setName(toString()); - override student name value;
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
