package shiri_tori;

import java.util.ArrayList;
import java.util.List;

public class Referee {
	
	private List<String> wordBox;
	private String previousWord;
	
	public Referee() {
		wordBox = new ArrayList<String>();
	}
	
	public List<String> getWordBox() {
		return wordBox;
	}

	public void setWordBox(List<String> wordBox) {
		this.wordBox = wordBox;
	}
	
	public void setWordBox(String word) {
		this.wordBox.add(word);
	}

	public boolean isNewWord(String playersWord) {
		for (int i =0; i< wordBox.size(); i++) {
			if (playersWord.equals(wordBox.get(i))) {
				return false;
			}
		}
		return true;
	}

	public String getPreviousWord() {
		return previousWord;
	}

	public void setPreviousWord(String previousWord) {
		this.previousWord = previousWord;
	}

	public boolean isIlligal(String inputWord) {
		char inputPrefix = inputWord.charAt(0);
		char previousSuffix = StringUtil.getLastChar(this.previousWord);
		
		if (inputPrefix != previousSuffix) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean canContinue(String inputWord) {
		if (StringUtil.getLastChar(inputWord) == 'ん') {
			return false;
		} else {
			return true;
		}
	}
	

}
