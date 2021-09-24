package com.testproject.coursework;

public class Employee {
    String id;
    int department;
    int salary;

    public Employee(String id, int department, int salary) {
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
        int[] department = new int[5];                   //отдел на 5
    }

    //public static String id() {                        //это статическая переменная?

    //}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void main(String[] args) {
        Employee Employee = new Employee();

    //     public Employee() {
      //      this.employee = new Employee[10];
        }
    }

