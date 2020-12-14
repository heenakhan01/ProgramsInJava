
class AnagramQuestion {

	public static void main(String[] args) {

		System.out.println(isAnagram("mary", "Army"));
	}

	public static boolean isAnagram(final String str1, final String str2) {
		if (str1.equals(str2)) {
			return true;
		}
		if (str1.length() != str2.length()) {
			return false;
		}
		final int[] count = new int[26];
		for (int i = 0; i < str1.length(); ++i) {

			++count[str1.toLowerCase().charAt(i) - 'a'];

		}

		for (int i = 0; i < str2.length(); ++i) {

			--count[str2.toLowerCase().charAt(i) - 'a'];

		}

		for (int i = 0; i < 26; ++i) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
