package org.example.Lesson9Homework;

import java.util.Collection;

public class TestClassXML {
    public static void main(String[] args) {
        PlayerService service = new PlayerServiceXML();

        // Создание игрока и добавление очков
        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        // Вывод всех игроков
        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

        // Дополнительные проверки
        System.out.println("\n--- Дополнительные проверки ---");

        // Создадим еще одного игрока
        int playerId2 = service.createPlayer("Turbo");
        service.addPoints(playerId2, 40);

        // Получаем игрока по ID
        Player foundPlayer = service.getPlayerById(playerId);
        System.out.println("\nНайденные игроки: " + foundPlayer);

        // Удаляем игрока
        Player deletedPlayer = service.deletePlayer(playerId2);
        System.out.println("\nУдаленные игроки: " + deletedPlayer);

        // Выводим оставшихся игроков
        System.out.println("\nОставшиеся игроки:");
        for (Player player : service.getPlayers()) {
            System.out.println(player);
        }
    }
}
