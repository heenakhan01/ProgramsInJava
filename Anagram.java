import java.util.HashMap;

public class Anagram {

	public static void main(String args[]) {
		String s1 = "aaba";
		String s2 = "aaab";
		int count = 0;
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			Character c1 = s1.toLowerCase().charAt(i);
			if (!map1.containsKey(c1)) {
				map1.put(c1, 1);
			} else {
				count = map1.get(c1);
				map1.put(c1, count + 1);
			}
		}

		for (int j = 0; j < s2.length(); j++) {
			Character c2 = s2.toLowerCase().charAt(j);
			if (!map2.containsKey(c2)) {
				map2.put(c2, 1);
			} else {
				count = map2.get(c2);
				map2.put(c2, count + 1);
			}
		}

		boolean result = map1.equals(map2);

		System.out.println(result);
	}

}
