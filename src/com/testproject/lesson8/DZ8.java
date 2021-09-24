package com.testproject.lesson8;

public class DZ8 {
    public static void main(String[] args) {

        Author author = new Author("Aleksandr", "Pushkin");
        Author author1 = new Author("Ivan", "Turgenev");
        Book book1 = new Book("Metel", author, 1985);
        Book book3 = new Book("Metel", author, 1985);
        Book book4 = new Book("Metel", author, 1985);
        Book book5 = new Book("Metel", author, 1985);
        Book book2 = new Book("Накануне", author1, 1967);
        book2.setPublishYear(1969);//изменила год вызовом сеттера

        System.out.println(book1);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
    }

}
