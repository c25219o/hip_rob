package shiri_tori;

import java.io.IOException;

public class GameRepeater {
	
	private static final String END_SIGN = "0";
	
	private static InputReciever reciever;
	
	
	public static void oneGameReperter(Dictionary dictionary) throws IOException {
		reciever = new InputReciever();

		Referee referee = new Referee();

		Presenter.gameStart();
		
		boolean isNotFirst = false;

		// repeat not give up*****
		do {

			// repeat input $$$$$

			// prepare for input
			String playersWord = null;

			// input and check the word
			playersWord = reciever.requirePlayersWord(referee, isNotFirst);

			// set the word to referee's box
			referee.setWordBox(playersWord);

			// seek word
			Seeker seeker = new Seeker(dictionary);
			String foundWord = seeker.seekAnyWord(referee, playersWord);

			// present
			if (!foundWord.isEmpty()) {
				Presenter.tellFoundWord(foundWord);
				referee.setWordBox(foundWord);
				referee.setPreviousWord(foundWord);
				isNotFirst = true;
			} else {
				Presenter.giveup();
				break;
			}
		} while (true);

		// give up or continue

		// repeat *****

		// one game finished
		// copy keeper's box to dictionary
		dictionary.setMyWordsList(referee.getWordBox());
	}
	
	public static boolean repeatController() throws IOException {

		// end or continue
		Presenter.askOneMoreChallenge();
		String answer = reciever.requireContinueOrEnd();

		if (answer.equals(END_SIGN)) {
			return true;
		} else {
			return false;
		}
	}

}
