package br.com.java.marathon.oo;

import br.com.java.marathon.oo.domain.Student;
import br.com.java.marathon.oo.domain.StudentPrinter;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Foo";
        student1.gender = 'M';
        student1.age = 30;

        Student student2 = new Student();
        student2.name = "Bar";
        student2.gender = 'F';
        student2.age = 31;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.age);

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.age);

        StudentPrinter printer = new StudentPrinter();

        // -- method using reference object
        printer.printStudentData(student1);
        printer.printStudentData(student2);

        // -- this reference use of object student
        student1.printStudentData();
        student2.printStudentData();
    }
}
