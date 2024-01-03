import java.util.Random;
import java.util.Scanner;

public class NimGame {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		firstPlayer();
		
	}
	
	public static void firstPlayer() {
		String playerOne, playerTwo;
		
		System.out.println("Joueur 1, quel est votre nom?");
		playerOne = scan.nextLine();
		
		System.out.println("Joueur 2, quel est votre nom?");
		playerTwo = scan.nextLine();
		
		String[] playerList = {playerOne, playerTwo};
		
		int alea = new Random().nextInt(2);
		System.out.println(playerList[alea]);
	}

}
