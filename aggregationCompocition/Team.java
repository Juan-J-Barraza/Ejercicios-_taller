package aggregationCompocition;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team() {
        players = new ArrayList<>();
    }

    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player findPlayer(String name) {
        return players.stream().filter(rueda -> rueda.getName().equals(name)).findFirst().orElse(null);
    }

    public Boolean deletePlayer(Player player) {
        return players.remove(player);
    }

    public void cleanTeam() {
        players.clear();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
