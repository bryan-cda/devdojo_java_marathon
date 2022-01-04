package br.com.functional.programming;

import br.com.functional.model.Person;

import java.util.function.Supplier;

public class SupplierUse {
    public static void main(String[] args) {
        Supplier<Person> generatePerson = Person::new;
        Person person = generatePerson.get();
        person.setName("John");
        person.setAge(28);
        System.out.println(person);
    }
}
