package Player.PlayerDemoMeven;
import java.util.HashSet;
import java.util.Set;

public class Player {
	private Set<String> players;
	 
    public Player() {
        this.players = new HashSet<String>();
    }
 
    public void addPlayer(String player) {
        players.add(player);
    }
 
    public void removePlayer(String player) {
        players.remove(player);
    }
 
    public boolean hasPlayer(String player) {
        return players.contains(player);
    }
 
    public void displayPlayers() {
        System.out.println("Players in the team:");
        for (String player : players) {
            System.out.println(player);
        }
    }
 
    public static void main(String[] args) {
       Player team = new Player();
        team.addPlayer("player1");
        team.addPlayer("player2");
        team.addPlayer("player3");
        team.addPlayer("player4");
        team.addPlayer("player5");
        team.displayPlayers();
 
        System.out.println("Is Player2 in the team? " + team.hasPlayer("Player2"));
 
        team.removePlayer("Player1");
 
        team.displayPlayers();
    }
	

}
