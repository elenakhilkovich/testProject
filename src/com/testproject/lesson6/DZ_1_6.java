package com.testproject.lesson6;

public class DZ_1_6 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private static void exercise1() {
        System.out.println("упражнение 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " - " + firstName + " - " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    private static void exercise2() {
        System.out.println("упражнение 2");
        String fullName = "Ivanov Ivan Ivanovich ";
        System.out.println("Данные ФИО сотрудника для заполнения отчета –" + fullName.toUpperCase());
    }

    private static void exercise3() {
        System.out.println("упражнение 3");
        String fullName = "Ivanov Ivan Ivanovich ";
        String fullName1 =  fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + fullName1);
    }

    private static void exercise4() {
        System.out.println("упражнение 4");
        String fullName = "Иванов Семён Семёнович";
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println(fullName2);
    }

    private static void exercise5() {
        System.out.println("упражнение 5");
        String INIT_STRING = "Ivanov Ivan Ivanovich";

        String fullName = INIT_STRING.replace(' ', '-');
        String[] splittedStr = INIT_STRING.split(" ");

        String firstName = splittedStr[1];
        String middleName = splittedStr[2];
        String lastName = splittedStr[0];
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

    }
}
