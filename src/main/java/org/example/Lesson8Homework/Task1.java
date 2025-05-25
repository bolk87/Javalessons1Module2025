package org.example.Lesson8Homework;

//Дан timestamp (отметка времени) публикации поста в социальной сети.
//LocalDate publishDate = LocalDate.now().minusDays(1);
//LocalTime publishTime = LocalTime.now().minusHours(5);
//LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);
//Изучите класс Duration
//Реализуйте интерфейс HumanReadableTimestamp ссылка. Напишите функцию,
//которая принимает на вход отметку времени, а возвращает строку вида:
//опубликовано X Y назад, где X - рассчитанный период, а Y – единица времени
//        (минуты|часы|дни)
//Требования:
//        ● если публикация была меньше часа назад, написать один из вариантов:
//        ○ опубликовано X минут назад
//○ опубликовано X минуту назад (1, 21, 31, 41, 51 минуту назад)
//○ опубликовано X минуты назад (2, 3, 4, 22, 54 минуты назад)
//● если публикация была сделана меньше суток назад, написать один из
//вариантов:
//        ○ опубликовано X часов назад
//○ опубликовано X час назад (1, 21 час назад)
//○ опубликовано X часа назад(2, 3, 4, 22, 23 часа назад)
//● если публикация была сделана 1 день назад, написать:
//        ○ опубликовано вчера
//● во всех остальных случаях, написать
//○ опубликовано X дней назад (5, 20, 99, 100, 111 дней назад)
//○ опубликовано X дня назад (2, 3, 4, 22, 23, 92 дня назад)
//○ опубликовано X день назад (1, 21, 31, 101 день назад)
//        Для самопроверки, можно менять publishDate и publishTime, отнимая разное
//количество временн`ых единиц

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        HumanReadableTimestamp timestampFormatter = new HumanReadableTimestampImpl();

        // Тестовые примеры
        LocalDateTime test1 = LocalDateTime.now().minusMinutes(5);
        LocalDateTime test2 = LocalDateTime.now().minusHours(3);
        LocalDateTime test3 = LocalDateTime.now().minusDays(1);
        LocalDateTime test4 = LocalDateTime.now().minusDays(3);
        LocalDateTime test5 = LocalDateTime.now().minusMinutes(61);

        System.out.println(timestampFormatter.getTimestamp(test1));
        System.out.println(timestampFormatter.getTimestamp(test2));
        System.out.println(timestampFormatter.getTimestamp(test3));
        System.out.println(timestampFormatter.getTimestamp(test4));
        System.out.println(timestampFormatter.getTimestamp(test5));
    }
}
