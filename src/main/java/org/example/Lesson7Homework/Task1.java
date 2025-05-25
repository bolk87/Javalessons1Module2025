package org.example.Lesson7Homework;

public class Task1 {
    public static void main(String[] args) {
        Player player1 = new Player(1, "Salach", true);
        Player player2 = new Player(1, "Salach", true);

        System.out.println("player1 == player2: " + (player1 == player2)); // false
        System.out.println("player1.equals(player2): " + player1.equals(player2)); // true
    }
}
