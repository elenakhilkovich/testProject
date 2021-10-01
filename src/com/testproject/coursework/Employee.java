package com.testproject.coursework;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String name;
    private int department;
    private double salary;
    private static int counter = 0;               //это счетчик, отвечает за id

    public Employee(String name, int department, double salary) {
        this.id = counter++;                    //просматривает всех работников
        this.department = department;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }   //void - ничего не возвращает


    @Override
    public String toString() {
        return name + ", " + department + " отдел, зарплата " + salary + " рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && department == employee.department && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }
}


