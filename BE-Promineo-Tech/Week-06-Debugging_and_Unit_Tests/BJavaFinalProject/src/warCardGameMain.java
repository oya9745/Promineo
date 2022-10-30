import java.util.Random;

import TurtleGraphics.KeyboardReader;

public class warCardGameMain {

	public static void main(String[] args) {
	
		KeyboardReader reader = new KeyboardReader();
		Random generator = new Random();
		String key;
		int randomCard, playerOneScore = 0, playerTwoScore = 0;
		for(int i = 0; i <26; i++) {
			System.out.println("It is player one's turn (press a key and enter. if you want to end, type STOP): ");
			key = reader.readLine();
			if(key.equals("STOP")) {
				break;
			}
			randomCard = generator.nextInt(13) + 1;
			if(randomCard == 1) {
				System.out.println("You picked ace");
				playerOneScore = playerOneScore + 1;
			} else if(randomCard == 2) {
				System.out.println("You picked two");
				playerOneScore += 2;
			} else if(randomCard == 3) {
				System.out.println("You picked three");
				playerOneScore += 3;
			} else if(randomCard == 4) {
				System.out.println("You picked four");
				playerOneScore += 4;
			} else if(randomCard == 5) {
				System.out.println("You picked five");
				playerOneScore += 5;
			} else if(randomCard == 6) {
				System.out.println("You picked six");
				playerOneScore += 6;
			} else if(randomCard == 7) {
				System.out.println("You picked seven");
				playerOneScore += 7;
			} else if(randomCard == 8) {
				System.out.println("You picked eight");
				playerOneScore += 8;
			} else if(randomCard == 9) {
				System.out.println("You picked nine");
				playerOneScore += 9;
			} else if(randomCard == 10) {
				System.out.println("You picked ten");
				playerOneScore += 10;
			} else if(randomCard == 11) {
				System.out.println("You picked Jack");
				playerOneScore += 11;
			} else if(randomCard == 12) {
				System.out.println("You picked Queen");
				playerOneScore += 12;
			} else if(randomCard == 13) {
				System.out.println("You picked King");
				playerOneScore += 13;
			}
			
			System.out.println("It is player two's turn (press a key and enter. if you want to end, type STOP): ");
			key = reader.readLine();
			if(key.equals("STOP")) {
				System.out.println("Player one: " + playerOneScore);
				System.out.println("Player two: " + playerTwoScore);
				break;
			}
			
			randomCard = generator.nextInt(13) + 1;
			if(randomCard == 1) {
				System.out.println("You picked ace");
				playerTwoScore = playerTwoScore + 1;
			} else if(randomCard == 2) {
				System.out.println("You picked two");
				playerTwoScore += 2;
			} else if(randomCard == 3) {
				System.out.println("You picked three");
				playerTwoScore += 3;
			} else if(randomCard == 4) {
				System.out.println("You picked four");
				playerTwoScore += 4;
			} else if(randomCard == 5) {
				System.out.println("You picked five");
				playerTwoScore += 5;
			} else if(randomCard == 6) {
				System.out.println("You picked six");
				playerTwoScore += 6;
			} else if(randomCard == 7) {
				System.out.println("You picked seven");
				playerTwoScore += 7;
			} else if(randomCard == 8) {
				System.out.println("You picked eight");
				playerTwoScore += 8;
			} else if(randomCard == 9) {
				System.out.println("You picked nine");
				playerTwoScore += 9;
			} else if(randomCard == 10) {
				System.out.println("You picked ten");
				playerTwoScore += 10;
			} else if(randomCard == 11) {
				System.out.println("You picked Jack");
				playerTwoScore += 11;
			} else if(randomCard == 12) {
				System.out.println("You picked Queen");
				playerTwoScore += 12;
			} else if(randomCard == 13) {
				System.out.println("You picked King");
				playerTwoScore += 13;
			}
			System.out.println("Player one : " + playerOneScore );
			System.out.println("Player two: " + playerTwoScore);
			
		}
		
		if(playerOneScore > playerTwoScore) {
			System.out.println("Player one wins!");
		} else if (playerOneScore < playerTwoScore) {
			System.out.println("Player two wins!");
		} else {
			System.out.println("Tie");
		}
		
		}
	}


