package shiri_tori;

import java.io.IOException;

public class Main {


	public static void main(String[] args) throws IOException {

		// prepare for game
		Presenter.welcome();
		Dictionary dictionary = new Dictionary();


		// repeat continue game<<<<<
		boolean isEnd = false;

		do {
			GameRepeater.oneGameReperter(dictionary);
			isEnd = GameRepeater.repeatController();

		} while (!isEnd);
		// repeat <<<<<

		// end
		Presenter.gameEnd();
	}

}
