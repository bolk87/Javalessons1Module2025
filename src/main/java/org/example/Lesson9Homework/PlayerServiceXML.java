package org.example.Lesson9Homework;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PlayerServiceXML implements PlayerService{

    private final File file;
    private final AtomicInteger idGenerator;

    public PlayerServiceXML() {
        this.file = new File("players.xml");
        this.idGenerator = new AtomicInteger(1);
        initializeFile();
    }

    private void initializeFile() {
        if (!file.exists()) {
            savePlayers(new PlayersWrapper(new ArrayList<>()));
        }
    }

    @Override
    public Player getPlayerById(int id) {
        List<Player> players = loadPlayers().getPlayers();
        return players.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Collection<Player> getPlayers() {
        return loadPlayers().getPlayers();
    }

    @Override
    public int createPlayer(String nickname) {
        PlayersWrapper wrapper = loadPlayers();
        List<Player> players = wrapper.getPlayers();
        int newId = idGenerator.getAndIncrement();
        Player newPlayer = new Player(newId, nickname, 0, false);
        players.add(newPlayer);
        savePlayers(wrapper);
        return newId;
    }

    @Override
    public Player deletePlayer(int id) {
        PlayersWrapper wrapper = loadPlayers();
        List<Player> players = wrapper.getPlayers();
        Player playerToRemove = getPlayerById(id);
        if (playerToRemove != null) {
            players.remove(playerToRemove);
            savePlayers(wrapper);
        }
        return playerToRemove;
    }

    @Override
    public int addPoints(int playerId, int points) {
        PlayersWrapper wrapper = loadPlayers();
        Player player = getPlayerById(playerId);
        if (player != null) {
            player.setPoints(player.getPoints() + points);
            savePlayers(wrapper);
            return player.getPoints();
        }
        return -1;
    }

    private PlayersWrapper loadPlayers() {
        try {
            JAXBContext context = JAXBContext.newInstance(PlayersWrapper.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (PlayersWrapper) unmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
            return new PlayersWrapper(new ArrayList<>());
        }
    }

    private void savePlayers(PlayersWrapper wrapper) {
        try {
            JAXBContext context = JAXBContext.newInstance(PlayersWrapper.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(wrapper, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    @XmlRootElement
    public static class PlayersWrapper {
        private List<Player> players;

        public PlayersWrapper() {
            this.players = new ArrayList<>();
        }

        public PlayersWrapper(List<Player> players) {
            this.players = players;
        }

        @XmlElement(name = "player")
        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }
    }
}
