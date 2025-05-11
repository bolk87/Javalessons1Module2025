package org.example.Lesson4Homework;

public class Movie {
    String name; //название фильма
    int rating; //рейтинг фильма
    String genre; //жанр фильма
    String country; //страна
    boolean isHaveOscar; //есть ли оскар
    int year; //год

    public Movie(String name, int rating, String genre, String country, boolean isHaveOscar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
    }
}
