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
}
