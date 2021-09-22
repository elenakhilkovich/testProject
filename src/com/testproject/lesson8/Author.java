package com.testproject.lesson8;

import java.util.Objects;

public class Author {    //Это создала класс .

    private String authorName;  // имя автора
    private String authorFamily;    //фамилия автора

    public Author(String authorName, String authorFamily) {    //это типы полей (название, автор, )

        this.authorName = authorName;   //конструктор для имени автора
        this.authorFamily = authorFamily;    //конструктор для фамилии автора
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorFamily() {
        return authorFamily;
    }

    public String toString() {      //это для дз9     добавила метод toString, чтобы в объекте вывелась строка
        return authorName + authorFamily;        //это для дз 9
    }

    public boolean equals(Object other) {                //это для дз 9            добавила метод equals - проверка на равенство
        if (this.getClass() != other.getClass()) {         //это для дз 9
            return false;                                    //это для дз 9
        }
        Author c2 = (Author) other;                         //это для дз 9
        return authorName.equals(c2.authorName);                //это для дз 9
    }

    @Override                                    //почему желтое?
    public int hashCode() {                         //это для дз 9
        return Objects.hash(authorName);                        //это для дз 9


        //System.out.println()
    }
}
