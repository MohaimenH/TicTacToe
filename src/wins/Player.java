package wins;

public class Player {
	
	String p;
	int playerWins;
	
	public Player(String p) {
		this.p = p;
	}
	
	public void setPlayer(String p) {
		this.p = p;
	}
	
	public String getName() {
		return this.p;
	}
	public int getWins() {
		return this.playerWins;
	}
	
	public void setWins(int w) {
		this.playerWins = w;
	}
}
