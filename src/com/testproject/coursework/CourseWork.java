package com.testproject.coursework;

public class CourseWork {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[5];
        employees[0] = new Employee("Сидоров Сидор Сидорович", 1, 100000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 200000);
        employees[2] = new Employee("Андреев Андрей Андреевич", 3, 300000);
        employees[3] = new Employee("Антонов Антон Антонович", 4, 400000);
        employees[4] = new Employee("Васильев Василий Васильевич", 5, 500000);


        System.out.println("Затраты на ЗП в месяц составят: " + calculateSalarySum(employees));

        }
    public  static int calculateSalarySum(Employee[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }
        return sum;
    }


        // getAllEmployeesInfo();
        //  System.out.println("Затраты на зарплату в месяц равны " + calculateSalarySum());
//        public static void getAllEmpoyeesInfo(Employee[] arr) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println("№" + (i + 1) + arr[i]);
//            }
//    }

//    public class Employee {
//      //  private final Employee[] contacts;
//     //   private int size;
//
//       // public Employee() {
//       //     this.contacts = new Employee[10];
//        }
//
//
//


    }

