package outputs;

import java.util.Scanner;

import wins.Player;
import wins.TicTacToe;

public class GameTester {

	public static void main(String[] args) {
		int p1move = 1;
		int p2move = 1;
		int pos = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to a simple TicTacToe Game!");
		System.out.println("\n");
		System.out.println("The format of this game is a bit difficult compared to a visual one.");
		System.out.println("\n");
		System.out.println("The players have to manually enter the positions, eventually getting a winner.");
		System.out.println("\n");
		System.out.println("The positions format is shown below.");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("1|2|3");
		System.out.println("_ _ _");
		System.out.println("4|5|6");
		System.out.println("_ _ _");
		System.out.println("7|8|9");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("Once there is a prompt asking for positions, please enter an unused position from above.");
		
		System.out.println("The game will stop once we have a winner.");
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println("Who is the first player?");
		String name1 = input.nextLine();
		Player one = new Player(name1);
		
		System.out.println("\n");
		
		System.out.println("Who is the second player?");
		String name2 = input.nextLine();
		Player two = new Player(name2);
		
		System.out.println("\n");
		
		TicTacToe game = new TicTacToe(one, two);
		
		// Move Set 1
		
		System.out.println("Enter move " + p1move + " for " + one.getName());
		pos = input.nextInt();
		input.nextLine();
		game.setMove(pos, "p1");
		p1move++;
		
		System.out.println("Enter move " + p2move + " for " + two.getName());
		pos = input.nextInt();
		input.nextLine();
		game.setMove(pos, "p2");
		p2move++;
		
		System.out.println("\n");
		
		System.out.println("The Game Looks As Follows:");
		System.out.println("\n");
		
		for(int i = 0; i < 9; i++) {
			String[] board = game.getTTT();
			
			if(i == 0) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 1) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
				System.out.println("_ _ _");
			}
			
			else if (i == 3) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 4) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
				System.out.println("_ _ _");
			}
			
			else if (i == 6) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 7) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
			}
		}
		
		System.out.println("\n");
		
		// Move Set 2
		
		System.out.println("Enter move " + p1move + " for " + one.getName());
		pos = input.nextInt();
		input.nextLine();
		game.setMove(pos, "p1");
		p1move++;
		
		System.out.println("Enter move " + p2move + " for " + two.getName());
		pos = input.nextInt();
		input.nextLine();
		game.setMove(pos, "p2");
		p2move++;
		
		System.out.println("\n");
		System.out.println("The Game Looks As Follows:");
		System.out.println("\n");
		
		for(int i = 0; i < 9; i++) {
			String[] board = game.getTTT();
			
			if(i == 0) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 1) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
				System.out.println("_ _ _");
			}
			
			else if (i == 3) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 4) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
				System.out.println("_ _ _");
			}
			
			else if (i == 6) {
				System.out.print(board[i]);
				System.out.print("|");
			}
			
			else if (i == 7) {
				System.out.print(board[i]);
				System.out.print("|");
				System.out.println(board[i+1]);
			}
		}
		
		System.out.println("\n");
		
		// Move Set 3

		System.out.println("Enter move " + p1move + " for " + one.getName());
		pos = input.nextInt();
		input.nextLine();
		game.setMove(pos, "p1");
		p1move++;
		

		String winnercheck = game.winnerCheck();
		
		
		if (winnercheck.equals("draw")) {
			System.out.println("Enter move " + p2move + " for " + two.getName());
			pos = input.nextInt();
			input.nextLine();
			game.setMove(pos, "p2");
			p2move++;
			
			System.out.println("\n");
			System.out.println("The Game Looks As Follows:");
			System.out.println("\n");
			
			for(int i = 0; i < 9; i++) {
				String[] board = game.getTTT();
				
				if(i == 0) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 1) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 3) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 4) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 6) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 7) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
				}
			}
			System.out.println("\n");
		}
		
		else {
			System.out.println("\n");
			System.out.println("The Game Looks As Follows:");
			System.out.println("\n");
			for(int i = 0; i < 9; i++) {
				String[] board = game.getTTT();
				
				if(i == 0) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 1) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 3) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 4) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 6) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 7) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
				}
			}
		}
		
		winnercheck = game.winnerCheck();
		
		if (winnercheck.equals("draw")) {
		// Move Set 4
		
			System.out.println("Enter move " + p1move + " for " + one.getName());
			pos = input.nextInt();
			input.nextLine();
			game.setMove(pos, "p1");
			p1move++;
			
			winnercheck = game.winnerCheck();
			
			if (winnercheck.equals("draw")) {
			
			System.out.println("Enter move " + p2move + " for " + two.getName());
			pos = input.nextInt();
			input.nextLine();
			game.setMove(pos, "p2");
			p2move++;
			
			System.out.println("\n");
			System.out.println("The Game Looks As Follows:");
			System.out.println("\n");
			
			for(int i = 0; i < 9; i++) {
				String[] board = game.getTTT();
				
				if(i == 0) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 1) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 3) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 4) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 6) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 7) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
				}
			}
			}
			
			System.out.println("\n");
			
		
			winnercheck = game.winnerCheck();
			
		
			if (winnercheck.equals("draw")) {
				// Move Set 5
		
				System.out.println("Enter move " + p1move + " for " + one.getName());
				pos = input.nextInt();
				input.nextLine();
				game.setMove(pos, "p1");
				p1move++;
			}
			
			System.out.println("\n");
			System.out.println("The Game Looks As Follows:");
			System.out.println("\n");
			
			for(int i = 0; i < 9; i++) {
				String[] board = game.getTTT();
				
				if(i == 0) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 1) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 3) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 4) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
					System.out.println("_ _ _");
				}
				
				else if (i == 6) {
					System.out.print(board[i]);
					System.out.print("|");
				}
				
				else if (i == 7) {
					System.out.print(board[i]);
					System.out.print("|");
					System.out.println(board[i+1]);
				}
			}
			System.out.println("\n");
		}
		
		String winner = game.winnerCheck();
		
		if(winner.equals("p1")) {
			System.out.println("\n");
			System.out.println(one.getName() + " Won!");
			game.setWinsForPlayer(name1, 1);
		}
		
		else if(winner.equals("p2")) {
			System.out.println("\n");
			System.out.println(two.getName() + " Won!");
			game.setWinsForPlayer(name2, 1);
		}
		
		else {
			System.out.println("Its a draw!");
		}
		
		System.out.println("==========================================");
		
		
		System.out.println("Whose wins would you like to check?");
		
		String check = input.nextLine();
		
		System.out.println(game.getWinsForPlayer(check));
		
		input.close();
	}

}
