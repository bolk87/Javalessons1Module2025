package org.example.Lesson8Homework;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HumanReadableTimestampImpl implements HumanReadableTimestamp{
    @Override
    public String getTimestamp(LocalDateTime timestamp) {
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(timestamp, now);

        long minutes = duration.toMinutes();
        long hours = duration.toHours();
        long days = ChronoUnit.DAYS.between(timestamp.toLocalDate(), now.toLocalDate());

        if (minutes < 60) {
            return formatMinutes(minutes);
        } else if (hours < 24 && days < 1) {
            return formatHours(hours);
        } else if (days == 1) {
            return "опубликовано вчера";
        } else {
            return formatDays(days);
        }
    }

    private String formatMinutes(long minutes) {
        if (minutes % 10 == 1 && minutes % 100 != 11) {
            return "опубликовано " + minutes + " минуту назад";
        } else if (minutes % 10 >= 2 && minutes % 10 <= 4 &&
                !(minutes % 100 >= 12 && minutes % 100 <= 14)) {
            return "опубликовано " + minutes + " минуты назад";
        } else {
            return "опубликовано " + minutes + " минут назад";
        }
    }

    private String formatHours(long hours) {
        if (hours % 10 == 1 && hours % 100 != 11) {
            return "опубликовано " + hours + " час назад";
        } else if (hours % 10 >= 2 && hours % 10 <= 4 &&
                !(hours % 100 >= 12 && hours % 100 <= 14)) {
            return "опубликовано " + hours + " часа назад";
        } else {
            return "опубликовано " + hours + " часов назад";
        }
    }

    private String formatDays(long days) {
        if (days % 10 == 1 && days % 100 != 11) {
            return "опубликовано " + days + " день назад";
        } else if (days % 10 >= 2 && days % 10 <= 4 &&
                !(days % 100 >= 12 && days % 100 <= 14)) {
            return "опубликовано " + days + " дня назад";
        } else {
            return "опубликовано " + days + " дней назад";
        }
    }
}
