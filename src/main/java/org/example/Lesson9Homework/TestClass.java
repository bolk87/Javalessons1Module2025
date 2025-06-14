package org.example.Lesson9Homework;

import java.util.Collection;

public class TestClass {
    public static void main(String[] args) {
        PlayerService service = new PlayerServiceJSON();

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }
        // Дополнительные тесты
        System.out.println("\n--- Дополнительные проверки ---");

        // Создание еще одного игрока
        int playerId2 = service.createPlayer("KingArtur");
        service.addPoints(playerId2, 50);

        // Получаем игрока по ID
        Player foundPlayer = service.getPlayerById(playerId);
        System.out.println("\nНайденные игроки: " + foundPlayer);

        // Удаляем игрока
        Player deletedPlayer = service.deletePlayer(playerId2);
        System.out.println("\nУдаленный игрок: " + deletedPlayer);

        // Выводим оставшихся игроков
        System.out.println("\nВывод оставшихся игроков:");
        for (Player player : service.getPlayers()) {
            System.out.println(player);
        }
    }
}
