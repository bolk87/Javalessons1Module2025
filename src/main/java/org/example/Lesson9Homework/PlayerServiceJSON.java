package org.example.Lesson9Homework;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayerServiceJSON implements PlayerService{
    private final File file;
    private final ObjectMapper mapper;
    private final AtomicInteger idGenerator;

    public PlayerServiceJSON() {
        this.file = new File("players.json");
        this.mapper = new ObjectMapper();
        this.idGenerator = new AtomicInteger(1);
        initializeFile();
    }

    private void initializeFile() {
        if (!file.exists()) {
            try {
                file.createNewFile();
                mapper.writeValue(file, new ArrayList<Player>());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Player getPlayerById(int id) {
        List<Player> players = loadPlayers();
        return players.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Player> getPlayers() {
        return loadPlayers();
    }

    @Override
    public int createPlayer(String nickname) {
        List<Player> players = loadPlayers();
        int newId = idGenerator.getAndIncrement();
        Player newPlayer = new Player(newId, nickname, 0, false);
        players.add(newPlayer);
        savePlayers(players);
        return newId;
    }

    @Override
    public Player deletePlayer(int id) {
        List<Player> players = loadPlayers();
        Player playerToRemove = getPlayerById(id);
        if (playerToRemove != null) {
            players.remove(playerToRemove);
            savePlayers(players);
        }
        return playerToRemove;
    }

    @Override
    public int addPoints(int playerId, int points) {
        List<Player> players = loadPlayers();
        Player player = getPlayerById(playerId);
        if (player != null) {
            player.setPoints(player.getPoints() + points);
            savePlayers(players);
            return player.getPoints();
        }
        return -1;
    }

    private List<Player> loadPlayers() {
        try {
            CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Player.class);
            return mapper.readValue(file, type);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void savePlayers(List<Player> players) {
        try {
            mapper.writeValue(file, players);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
