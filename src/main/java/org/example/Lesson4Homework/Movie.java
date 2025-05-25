package org.example.Lesson4Homework;

public class Movie {
    String name; //название фильма
    int rating; //рейтинг фильма
    String genre; //жанр фильма
    String country; //страна
    boolean isHaveOscar; //есть ли оскар
    int year; //год

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHaveOscar(boolean haveOscar) {
        isHaveOscar = haveOscar;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public boolean isHaveOscar() {
        return isHaveOscar;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isHaveOscar=" + isHaveOscar +
                ", year=" + year +
                '}';
    }

    public Movie(String name, int rating, String genre, String country, boolean isHaveOscar, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
    }
}
