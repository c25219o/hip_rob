package shiri_tori;

public class StringUtil {
	
	public static char getLastChar(String word) {
		return word.charAt(word.length() - 1);
	}
	


	public static boolean isEmpty(String inputWord) {
		if ("".equals(inputWord) || null == inputWord) {
			return true;
		} else {
			return false;
		}
	}

}
