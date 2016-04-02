package shiri_tori;

/**
 * presenter class
 * (only speak to players)
 * 
 * @author ishino
 *
 */
public class Presenter {
	
	public static void giveup() {
		System.out.println("YOU WIN!\n");
	}

	public static void alreadyUsed() {
		System.out.println("ALREADY USED. INPUT ONCE MORE -->");
	}

	public static void tellFoundWord(String foundWord) {
		System.out.println("COMPUTER:【" + foundWord + "】");
		System.out.println("IT'S YOUR TURN");
	}

	public static void tellEmpty() {
		System.out.println("EMPTY. INPUT ONCE MORE -->");
	}

	public static void askOneMoreChallenge() {
		System.out.println("IF YOU WANT A NEW GAME, INPUT ANY WORD.");
		System.out.println("OTHERWISE, INPUT \"0\" -->");
	}

	public static void welcome() {
		System.out.println("WELCOME TO HIP ROBBER GAME!");
		
	}

	public static void gameStart() {
		System.out.println("GAME START ^^");
		
	}

	public static void gameEnd() {
		System.out.println("GAME END.");
		System.out.println("GOOD BYE!");
	}

	public static void tellIllegal() {
		System.out.println("ILLIGAL WORD. INPUT ONCE MORE -->");
	}
	

}
