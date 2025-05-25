package org.example.Lesson7Homework;

//Задание 1. data-класс
//● Опишите класс Player (игрок)
//● У игрока есть поля:
//○ id (int)
//○ nickname (String)
//○ isOnline (boolean)
//● Все поля должны быть приватными
//● Переопределите для класса методы equals(), hashCode() и toString()
//● В отдельном классе (Task1) создайте двух игроков с одинаковыми значениями
//полей.
//● Убедитесь, что player1 == player2 ==> false
//● Убедитесь, что player1.equals(player2) ==> true

import java.util.Objects;

public class Player {
    private int id;
    private String nickname;
    private boolean isOnline;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname, player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
