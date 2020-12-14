import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringSentence {
	public static void main(String args[]) {
		String sentence = "This is the string sentence to reverse";
		String[] words = sentence.split(" ");
		String result = "";
		int i = 0;
		int j = words.length - 1;
		String temp = "";
		while (i < j) {
			temp = words[i];
			words[i] = words[j];
			words[j] = temp;
			i++;
			j--;
		}

		result = String.join(" ", (CharSequence[]) words);
		System.out.println(result);
		reverseWords("This is an example");
		usingListReverseWords("Hello World");
	}
	public static void reverseWords(String str) {
		
		StringBuilder str_rev = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; --i) {
			str_rev.append(str.charAt(i));
		}
		System.out.println(str_rev.toString());
	}
	
	public static void usingListReverseWords(String s) {
		String[] words = s.split("\\s");
		List<String> list = Arrays.asList(words);
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder(s.length());
		for(int i=0;i<list.size();i++) {
			sb.append(list.get(i));
			sb.append(' ');
		}
		
		
		
		System.out.println(sb.toString());
	}

}
