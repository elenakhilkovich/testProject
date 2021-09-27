package com.testproject.coursework;

import java.util.Objects;

public class Employee {
    private int id;            //почему не создается final?
    private  String name;          //надо private final?
    private int department;
    private double salary;
    private static int counter;               //это счетчик, отвечает за id

    public Employee(String name, int department, double salary) {
        this.id = counter++;                    //просматривает всех работников
        this.department = department;
        this.salary = salary;
        this.name = name;

    }

    public Employee() {
        int[] department = new int[5];                   //отдел на 5. Так?
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
    }


    @Override
    public String toString() {
           return name + " - " + department + " - " +salary+ " рублей.";
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


