package org.example.Lesson7Homework;

import org.example.Lesson4Homework.Movie;

import java.util.List;

public class Company {
    private String name;
    private int year;
    private List<Movie> movies;

    public Company(String name, int year, List<Movie> movies) {
        this.name = name;
        this.year = year;
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", movies=" + movies +
                '}';
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
