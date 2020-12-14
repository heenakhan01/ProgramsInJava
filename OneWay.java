
public class OneWay {

	public static void main(String args[]) {
		System.out.println(chkOneWay("pale", "ple"));
	}

	public static boolean chkOneWay(String s1, String s2) {
		String first = s1.toLowerCase();
		String second = s2.toLowerCase();
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}
		first = s1.length() < s2.length() ? first : second;
		second = s1.length() < s2.length() ? second : first;
		int index1 = 0;
		int index2 = 0;
		boolean foundDiff = false;
		while (index2 < second.length() && index1 < first.length()) {
			if (first.charAt(index1) != second.charAt(index2)) {
				//to check if there are more than 1 differences
				if (foundDiff) {
					return false;
				}
				foundDiff = true;
				//to check cases like bale and pale same length case 
				if (first.length() == second.length()) {
					index1++;
				}
			} else {
				index1++;
			}
			index2++;
		}

		return true;
	}

}
