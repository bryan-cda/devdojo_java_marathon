package br.com.java.marathon.oo.test;

import br.com.java.marathon.oo.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(33);
        employee.setSalaries(new double[]{450, 613, 920, 1100, 1400, 1500, 1900, 2500, 2800, 3500, 7250, 9102, 12500, 17000, 18000});
        employee.printEmployeeSalaryData();
    }
}
