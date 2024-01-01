package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.Student;
import br.com.java.marathon.oo.domain.StudentPrinter;

public class StudentTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student1 = new Student();
        student1.setName("Foo");
        student1.setGender('M');
        student1.setAge(30);

        Student student2 = new Student();
        student2.setName("Bar");
        student2.setGender('F');
        student2.setAge(31);

        System.out.println(student1.getName());
        System.out.println(student1.getGender());
        System.out.println(student1.getAge());

        System.out.println(student2.getName());
        System.out.println(student2.getGender());
        System.out.println(student2.getAge());

        StudentPrinter printer = new StudentPrinter();

        // -- method using reference object
        printer.printStudentData(student1);
        printer.printStudentData(student2);

        // -- this reference use of object student
        //student1.printStudentData();
        //student2.printStudentData();
    }
}
