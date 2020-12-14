
public class CountPalindromes {

	// 1.Take one boolean matrix to store the isPalindrome method results
	// 2.From question it is understood that each character is palindrome of itself
	// 3.Utlize the information from point 2 and set up all the boolean[i][i] to
	// true
	// 4.Then iterate over the string using two pointer where one pointer checks
	// from
	// startIndex =0 to n-1 and other pointer checks from n-1 to 0
	// 5.If while traversing these you come across any false value then
	// call the isPalindrome(s,startIndex,endIndex)
	// function and check if the value is true if true then->
	// a.increase count
	// b.set the M[i][j]=true;
	// c.we need to set a,b points for all the values from the row to avoid
	// repeated calls to isPalindrome
	// and that is because we know that as we traverse
	// inside the characters will be same if the string is palindrome
	// that by using a while(startIndex<endIndex)

	public static int isPalindromeChk(String s) {
		int count = s.length();
		boolean[][] M = new boolean[s.length()][s.length()];
		for (int i = 0; i < M.length; i++) {
			M[i][i] = true;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length() - 1; j > 0; j--) {
				if (!M[i][j]) {
					if (isPal(s, i, j)) {
						while (i < j) {
							count++;
							M[i][j] = true;
							i++;
							j--;
						}
					}
				}
			}
		}
		return count;
	}

	public static boolean isPal(String s, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			if (s.charAt(startIndex) != s.charAt(endIndex)) {
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "tacocat";
		System.out.println(isPalindromeChk(s));
	}

}
