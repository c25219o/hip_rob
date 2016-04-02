package shiri_tori;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReciever {

	private BufferedReader br;

	String inputWord;

	boolean inputOnceMore;

	public InputReciever() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String requirePlayersWord(Referee referee, boolean isNotFirst) throws IOException {
		System.out.print("INPUT WORD -->");

		// input and return
		do {
			inputWord = br.readLine();

			if (StringUtil.isEmpty(inputWord)) {
				Presenter.tellEmpty();
				inputOnceMore = true;
				continue;
			} else {
				inputOnceMore = false;
			}
			
			if (!referee.canContinue(inputWord)) {
				inputOnceMore = true;
				continue;
			} else {
				inputOnceMore = false;
			}
			
			if (isNotFirst) {
				inputOnceMore = this.judgeOnceMore(referee);
			}

		} while (inputOnceMore);

		return inputWord;
	}
	
	private boolean judgeOnceMore(Referee referee) {
		
		boolean onceMore = false;

		if (!referee.isNewWord(inputWord)) {
			Presenter.alreadyUsed();
			return true;
		} else {
			onceMore = false;
		}
		
		if (referee.isIlligal(inputWord)) {
			Presenter.tellIllegal();
			onceMore = true;
		} else {
			onceMore = false;
		}
		
		return onceMore;
	}

	public String requireContinueOrEnd() throws IOException {
		return br.readLine();
	}

}
