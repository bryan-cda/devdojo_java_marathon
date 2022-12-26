package br.com.java.marathon.oo;

import br.com.java.marathon.oo.domain.Student;

public class OOTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Foo";
        student.gender = 'M';
        student.age = 30;

        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.age);
    }
}
