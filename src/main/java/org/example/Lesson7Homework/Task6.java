package org.example.Lesson7Homework;

import java.util.HashMap;
import java.util.Map;
//В задании 1 вы создали класс Player
//● Создайте Map<Player, Integer> points для хранения очков игроков
//● Положите в мэпу 10 игроков. У каждого 0 очков.
//● Игроку с id=4 запишите 10 очков
//● Игроку с id=7 – 12 очков
//● Игроку с id=8 – 11 очков
//● Игроку с id=9 – 13 очков
//● Игроку с id=10 – 5 очков
//● Выведите на экран 3х лучших игроков турнира*
//● На первом месте должен быть игрок с максимальным результатом
public class Task6 {
    public static void main(String[] args) {
        Map<Player, Integer> points = new HashMap<>();

        // Создаем 10 игроков и добавляем их в Map с 0 очков
        for (int i = 1; i <= 10; i++) {
            points.put(new Player(i, "Player" + i, true), 0);
        }

        updatePoints(points, 4, 10);
        updatePoints(points, 7, 12);
        updatePoints(points, 8, 11);
        updatePoints(points, 9, 13);
        updatePoints(points, 10, 5);

        printTopPlayers(points, 3);
    }
    private static void updatePoints(Map<Player, Integer> points, int playerId, int newPoints) {
        points.entrySet().stream()
                .filter(entry -> entry.getKey().getId() == playerId)
                .findFirst()
                .ifPresent(entry -> entry.setValue(newPoints));
    }


    private static void printTopPlayers(Map<Player, Integer> points, int topN) {
        System.out.println("Лучшие " + topN + " игрока:");

        points.entrySet().stream()
                .sorted(Map.Entry.<Player, Integer>comparingByValue().reversed())
                .limit(topN)
                .forEachOrdered(entry -> System.out.println(
                        entry.getKey() + " - " + entry.getValue() + " очков"));
    }
}
