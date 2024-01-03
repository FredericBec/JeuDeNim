import java.util.Random;
import java.util.Scanner;

public class NimGame {

	public static Scanner scan = new Scanner(System.in);
	public static int matchesCount = 21;
	
	public static void main(String[] args) {
		String playerOne, playerTwo;
		
		System.out.println("Joueur 1, quel est votre nom?");
		playerOne = scan.nextLine();
		
		System.out.println("Joueur 2, quel est votre nom?");
		playerTwo = scan.nextLine();
		
		String currentPlayer = firstPlayer(playerOne, playerTwo);
		System.out.println(currentPlayer);
		
		while(matchesCount > 0) {
			System.out.println("Allumette restantes :" + matchesCount);
			System.out.println("Joueur " + currentPlayer + ", choisissez un nombre d'allumette");
			int matchesNumber = scan.nextInt();
			
			if(matchesCount != 0) {
				if(validMove(matchesNumber)) {
					removeMatches(matchesNumber);					
					currentPlayer = currentPlayer.equals(playerOne) ? playerTwo : playerOne;
				}else System.out.println("Nombre d'allumettes non valide !!");
			}else System.out.println("le joueur " + currentPlayer + " a pris la dernière allumette");
		}
		
	}
	
	public static String firstPlayer(String playerOne, String playerTwo) {
		
		
		String[] playerList = {playerOne, playerTwo};
		
		int alea = new Random().nextInt(2);
		System.out.println("Le joueur qui commence est : ");
		return playerList[alea];
	}
	
	public static int removeMatches(int matches) {
		
		return matchesCount -= matches;
	}
	
	public static boolean validMove(int matches) {
		
		return matches >= 1 && matches <= 4 && matches <= matchesCount;
			
	}

}
