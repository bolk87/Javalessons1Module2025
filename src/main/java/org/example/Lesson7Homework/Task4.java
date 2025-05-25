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
        List <Company> companies = List.of (new Company("СССР", 1987, List.of(
                new Movie("Москва слезам не верит", 10, "драма",
                        "СССР", true, 1979),
                new Movie("Интерстелар", 10, "фантастика",
                        "США", false, 2014),
                new Movie("Ла-ла Ленд", 10, "мюзикл",
                        "США", true, 2017)
        )),
            new Company("СССР", 1987, List.of(
                    new Movie("Москва слезам не верит", 10, "драма",
                            "СССР", true, 1979),
                    new Movie("Интерстелар", 10, "фантастика",
                            "США", false, 2014),
                    new Movie("Ла-ла Ленд", 10, "мюзикл",
                            "США", true, 2017)
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
