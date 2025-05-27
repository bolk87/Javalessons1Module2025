package org.example.Lesson7Homework;

//Создайте класс Company (кинокомпания)
//● в классе создайте поля
//○ название
//○ год основания
//○ список фильмов, которые компания выпустила (по 3 штуки)
//● создайте в другом классе метод psvm.
//● в этом методе объявите список companies
//● положите в список 3 кинокомпании
//● каждой кинокомпании запишите в портфолио по 3 фильма
//● напечатайте информацию о всех компаниях в формате
//{название компании}: {названия всех фильмов}

import org.example.Lesson4Homework.Movie;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List <Company> companies = List.of (new Company("Мосфильм", 1987, List.of(
                new Movie("Москва слезам не верит", 10, "драма",
                        "СССР", true, 1979),
                new Movie("Любовь и голуби", 9, "комедия",
                        "СССР", false, 1985),
                new Movie("Благословите женщину", 8, "драма",
                        "Россия", false, 2003)
        )),
            new Company("20th Century Studios, Inc.", 1935, List.of(
                    new Movie("Аватар", 10, "фантастика",
                            "США, Великобритания", false, 2009),
                    new Movie("Изгой", 9, "драма",
                            "США", false, 2000),
                    new Movie("Один дома", 10, "комедия",
                            "США", false, 1990)
            )));
        companies.forEach(company -> {
            String moviesString = String.join(", ",
                    company.getMovies().stream()
                            .map(Movie::getName)
                            .toList());
            System.out.printf("%s (%d): %s%n",
                    company.getName(),
                    company.getYear(),
                    moviesString);
        });
    }
}
