package org.example.Lesson4Homework;

public class Films {
    public static void main(String[] args) {
        Movie[] films = {
                new Movie("Москва слезам не верит", 10, "драма",
                        "СССР", true, 1979),
                new Movie("Интерстелар", 10, "фантастика",
                        "США", false, 2014),
                new Movie("Ла-ла Ленд", 10, "мюзикл",
                        "США", true, 2017)
        };
        for (Movie movie: films) {
            System.out.println("Год - "+movie.year+
                    ", Название - "+movie.name+
                    ", Жанр - "+movie.genre+
                    ", Рейтинг - "+movie.rating+
                    ", Есть ли Оскар? -"+movie.isHaveOscar);
        }
    }
}
