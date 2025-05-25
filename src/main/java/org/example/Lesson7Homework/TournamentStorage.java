package org.example.Lesson7Homework;

import java.util.HashSet;
import java.util.Set;

public class TournamentStorage {
    private Set<Player> players = new HashSet<>();

    public boolean addPlayer(Player player) {
        return players.add(player);
    }

    public int getPlayerCount() {
        return players.size();
    }

    public void printAllPlayers() {
        players.forEach(System.out::println);
    }
}
