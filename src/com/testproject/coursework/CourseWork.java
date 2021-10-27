package com.testproject.coursework;

public class CourseWork {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Сидоров Сидор Сидорович", 1, 100000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 200000);
        employees[2] = new Employee("Андреев Андрей Андреевич", 3, 300000);
        employees[3] = new Employee("Антонов Антон Антонович", 4, 400000);
        employees[4] = new Employee("Васильев Василий Васильевич", 5, 500000);
        employees[5] = new Employee("Борисов Борис Борисович", 1, 150000);
        employees[6] = new Employee("Степанов Степан Степанович", 2, 250000);
        employees[7] = new Employee("Артемов Артем Артемович", 3, 350000);
        employees[8] = new Employee("Денисов Денис Денисович", 4, 450000);
        employees[9] = new Employee("Трофимов Трофим Трофимович", 5, 550000);

        printEmployeeInfo();
        System.out.println("Затраты на ЗП в месяц составят: " + calculateSalarySum() + " рублей.");
        System.out.println("Сотрудник с минимальной зарплатой" + minSalaryEmp());
        System.out.println("Сотрудник с максимальной зарплатой" + maxSalaryEmp());
        System.out.println("Средняя зарплата = " + calculateMidlSalary(employees) + " рублей.");
        getAllEmployeeName();
    }

    public static int calculateMidlSalary(Employee[] arr) {
        return calculateSalarySum() / arr.length;
    }

    public static void printEmployeeInfo() {
        for (Employee employee : employees) {                          //это метод foreach, перебирает нумерацию
            System.out.println("№" + (employee.getId() + 1) + " " + employee);
        }
    }

    public static void getAllEmployeeName() {
        for (Employee employee : employees) {                          //это метод foreach, перебирает ФИО
            System.out.println(employee.getName());
        }
    }

    public static int calculateSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {                          //это метод foreach, суммирует з/п
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee minSalaryEmp() {                 //нахожу сотрудника с мин. з/п
        int minSalId = 0;
        double minSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSal) {
                minSalId = i;
            }
        }
        return employees[minSalId];
    }

    public static Employee maxSalaryEmp() {                 //нахожу сотрудника с мax. з/п
        int maxSalId = 0;
        double maxSal = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSal) {
                maxSalId = i;
            }
        }
        return employees[maxSalId];

    }
}








