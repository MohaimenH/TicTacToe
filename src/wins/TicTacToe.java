package wins;

public class TicTacToe {
	
	Player[] players = new Player[2];
	
	int[] p1Pos = new int[5];
	int[] p2Pos = new int[5];
	int p1Moves;
	int p2Moves;
	String[] tictactoe = new String[9];
	
	public TicTacToe(String p1, String p2) {	
		players[0].setPlayer(p1);
		players[1].setPlayer(p1);
		
		for(int i =0; i < 9; i++) {
			tictactoe[i] = "" + (i + 1);
		}
	}
	
	public TicTacToe(Player p1, Player p2) {
		players[0] = p1;
		players[1] = p2;
		
		for(int i =0; i < 9; i++) {
			tictactoe[i] = "" + (i + 1);
		}

	}
	
	public void setMove(int pos, String p) {
		if (p.equals("p1")) {
			p1Pos[p1Moves] = pos;
			p1Moves++;
			tictactoe[pos-1] = "x";
		}
		else if (p.equals("p2")) {
			p2Pos[p2Moves] = pos;
			p2Moves++;
			tictactoe[pos-1] = "o";
		}
	}
	
	public String winnerCheck() {
		
		String winner = "draw";
		
		//CHECK P1
	
		for(int i = 0; i < 5; i++) {
			
			if(p1Pos[i] == 1) {
				for(int j = 0; j < 5; j++) {
					if(p1Pos[j] == 4) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 7) {
								winner = "p1";
							}
						}
					}
					else if (p1Pos[j] == 2) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 3) {
								winner = "p1";
							}
						}
					}
					else if (p1Pos[j] == 5 ) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 9) {
								winner = "p1";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p1Pos[i] == 3) {
				for(int j = 0; j < 5; j++) {
					if(p1Pos[j] == 6) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 9) {
								winner = "p1";
							}
						}
					}
					else if (p1Pos[j] == 5 ) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 7) {
								winner = "p1";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p1Pos[i] == 4) {
				for(int j = 0; j < 5; j++) {
					if(p1Pos[j] == 5) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 6) {
								winner = "p1";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p1Pos[i] == 7) {
				for(int j = 0; j < 5; j++) {
					if(p1Pos[j] == 8) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 9) {
								winner = "p1";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p1Pos[i] == 2) {
				for(int j = 0; j < 5; j++) {
					if(p1Pos[j] == 5) {
						for(int z = 0; z < 5; z++) {
							if (p1Pos[z] == 8) {
								winner = "p1";
							}
						}
					}
				}
			}
		}
		
		// CHECK Player2
		
		for(int i = 0; i < 5; i++) {
			
			if(p2Pos[i] == 1) {
				for(int j = 0; j < 5; j++) {
					if(p2Pos[j] == 4) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 7) {
								winner = "p2";
							}
						}
					}
					else if (p2Pos[j] == 2) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 3) {
								winner = "p2";
							}
						}
					}
					else if (p2Pos[j] == 5 ) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 9) {
								winner = "p2";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p2Pos[i] == 3) {
				for(int j = 0; j < 5; j++) {
					if(p2Pos[j] == 6) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 9) {
								winner = "p2";
							}
						}
					}
					else if (p2Pos[j] == 5 ) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 7) {
								winner = "p2";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p2Pos[i] == 4) {
				for(int j = 0; j < 5; j++) {
					if(p2Pos[j] == 5) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 6) {
								winner = "p2";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p2Pos[i] == 7) {
				for(int j = 0; j < 5; j++) {
					if(p2Pos[j] == 8) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 9) {
								winner = "p2";
							}
						}
					}
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(p2Pos[i] == 2) {
				for(int j = 0; j < 5; j++) {
					if(p2Pos[j] == 5) {
						for(int z = 0; z < 5; z++) {
							if (p2Pos[z] == 8) {
								winner = "p2";
							}
						}
					}
				}
			}
		}
		
		
		return winner;
		
	}
	
	public int getIndexOf(String name) {
		
		boolean found = false;
		
		int index = 0;
		for(int i = 0; i < 2 && found == false; i++) {
			if(players[i].getName().equals(name)) {
				found = true;
			}
			else {
				index++;
			}
		}
		
		if(found == false) {
			return 99999999;
		}
		else {
			return index;
		}
	}
	
	public String[] getTTT() {
		return tictactoe;
	}
	public void setWinsForPlayer(String name, int w) {
		
		int index = getIndexOf(name);
		
		players[index].setWins(w);
	}
	
	public String getWinsForPlayer(String name) {
		
		int index = getIndexOf(name);
		String wins = "";
		if (index == 99999999) {
			wins = "Player does not exist!";
		}
		
		else {
			wins = players[index].getName() + " has " + players[index].getWins() + " wins.";
		}
		return wins;
	}
	
}
