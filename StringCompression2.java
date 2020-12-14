
public class StringCompression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compress("aabcccccaaa"));
	}

	public static String compress(String s) {
		StringBuilder result = new StringBuilder();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
			if ((i + 1) >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				result.append(s.charAt(i)).append(count);
				System.out.println(result);
				count = 0;
			}
		}
		if (result.length() < s.length()) {
			return result.toString();
		} else {
			return s;
		}
	}

}
