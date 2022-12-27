package br.com.java.marathon.oo;

import br.com.java.marathon.oo.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "John";
        teacher.age = 45;
        teacher.gender = 'M';

        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.age);
    }
}
