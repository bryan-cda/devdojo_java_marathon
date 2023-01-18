package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("John");
        teacher.setAge(45);
        teacher.setGender('M');

        System.out.println(teacher.getName());
        System.out.println(teacher.getGender());
        System.out.println(teacher.getAge());
    }
}
