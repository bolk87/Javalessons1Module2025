package org.example.Lesson7Homework;
//В задании 1 вы создали класс Player
//● Создайте хранилище игроков. Его будет использовать программа,
//которая описывает турнир. Требования:
//○ Количество игроков неизвестно заранее. Может быть 2, а может
//100
//○ В турнир каждый игрок может записаться только 1 раз (не может
//быть дублей)
//● создайте 10 игроков и поместите их в хранилище.
//● убедитесь, что если один игрок помещен в хранилище дважды, дубликат
//не запишется

public class Task5 {
    public static void main(String[] args) {
        TournamentStorage storage = new TournamentStorage();

        // Создаем 10 игроков (два из них одинаковые)
        Player player1 = new Player(1, "VanDijk", true);
        Player player2 = new Player(2, "Alexander-Arnold", false);
        Player player3 = new Player(3, "Matip", true);
        Player player4 = new Player(4, "Gomez", true);
        Player player5 = new Player(5, "Konaté", false);
        Player player6 = new Player(6, "Tsimikas", true);
        Player player7 = new Player(7, "Bradley", true);
        Player player8 = new Player(8, "Henderson", false);
        Player player9 = new Player(9, "Thiago", true);
        Player player10 = new Player(1, "VanDijk", true); // Дубликат player1

        // Добавляем всех игроков (включая дубликат)
        System.out.println("Добавление игроков:");
        System.out.println("Player1 added: " + storage.addPlayer(player1));
        System.out.println("Player2 added: " + storage.addPlayer(player2));
        System.out.println("Player3 added: " + storage.addPlayer(player3));
        System.out.println("Player4 added: " + storage.addPlayer(player4));
        System.out.println("Player5 added: " + storage.addPlayer(player5));
        System.out.println("Player6 added: " + storage.addPlayer(player6));
        System.out.println("Player7 added: " + storage.addPlayer(player7));
        System.out.println("Player8 added: " + storage.addPlayer(player8));
        System.out.println("Player9 added: " + storage.addPlayer(player9));
        System.out.println("Player10 (дубликат) added: " + storage.addPlayer(player10));

        // Проверяем количество
        System.out.println("\nВсего уникальных игроков: " + storage.getPlayerCount());

        // Выводим всех игроков
        System.out.println("\nСписок игроков:");
        storage.printAllPlayers();
    }
}
