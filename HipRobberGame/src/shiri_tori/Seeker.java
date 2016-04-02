package shiri_tori;

public class Seeker {

	private Dictionary dictionary;

	public Seeker(Dictionary dictionary) {
		this.dictionary = dictionary;
	}

	public String seekAnyWord(Referee referee, String playersWord) {

		int lastIndex = playersWord.length() - 1;
		char lastChar = playersWord.charAt(lastIndex);

		return dictionary.search(referee, lastChar);
		
	}

}
