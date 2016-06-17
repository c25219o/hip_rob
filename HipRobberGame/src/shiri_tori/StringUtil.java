package shiri_tori;

public class StringUtil {

	public static char getLastChar(String word) {
		return word.charAt(word.length() - 1);
	}

	public static boolean isEmpty(String inputWord) {
		return "".equals(inputWord) || null == inputWord;
	}

}
