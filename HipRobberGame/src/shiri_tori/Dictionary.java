package shiri_tori;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

	private List<String> myWordsList;
	private static final String EMPTY = "";

	public Dictionary() {
		myWordsList = new ArrayList<String>();
		myWordsList.add("あずき");
		myWordsList.add("いんこ");
		myWordsList.add("うちゅう");
		myWordsList.add("えだまめ");
		myWordsList.add("おとな");
		myWordsList.add("かき");
		myWordsList.add("きつね");
		myWordsList.add("くも");
		myWordsList.add("けしごむ");
		myWordsList.add("こども");
		myWordsList.add("さとう");
		myWordsList.add("しずく");
		myWordsList.add("せみ");
		myWordsList.add("そうじ");
		myWordsList.add("たんぼ");
		myWordsList.add("ちず");
		myWordsList.add("つくね");
		myWordsList.add("てがみ");
		myWordsList.add("ともだち");
		myWordsList.add("なぞ");
		myWordsList.add("にんじゃ");
		myWordsList.add("ぬりえ");
		myWordsList.add("ねこ");
		myWordsList.add("のり");
		myWordsList.add("はまべ");
		myWordsList.add("ひつじ");
		myWordsList.add("ふぶき");
		myWordsList.add("へちま");
		myWordsList.add("ほととぎす");
		myWordsList.add("まつり");
		myWordsList.add("みみず");
		myWordsList.add("むつごろう");
		myWordsList.add("めだか");
		myWordsList.add("もり");
		myWordsList.add("やたい");
		myWordsList.add("ゆず");
		myWordsList.add("よる");
		myWordsList.add("らじお");
		myWordsList.add("りす");
		myWordsList.add("るり");
		myWordsList.add("れご");
		myWordsList.add("ろうそく");
		myWordsList.add("わた");
	}

	public List<String> getMyWordsList() {
		return myWordsList;
	}

	public void setMyWordsList(List<String> wordCollection) {
		this.myWordsList.addAll(wordCollection);
	}

	public void setMyWordsList(String word) {
		this.myWordsList.add(word);
	}

	/**
	 * search word from dictionary.
	 * 
	 * @param c
	 * @return
	 */
	public String search(Referee referee, char c) {

		for (int i = 0; i < myWordsList.size(); i++) {
			String foundWord = myWordsList.get(i);

			if (c == foundWord.charAt(0) && referee.isNewWord(foundWord)) {
				
				// prevent use same word 
				myWordsList.remove(i);
				
				return foundWord;
			}
		}
		return EMPTY;

	}

}
