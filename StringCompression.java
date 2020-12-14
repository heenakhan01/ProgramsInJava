import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {

	public static void main(String args[]) {
		getCompressedString("aabbgggdddR");
		
	}

	public static void getCompressedString(String str) {

		if (str == null) {
			System.out.println("Invalid input");
		}

		StringBuilder sb = new StringBuilder("");
		int count = 0;
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				count = map.get(c);
				map.put(c, count + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			sb.append(entry.getKey()).append(entry.getValue());

		}
		System.out.println(sb.toString());

	}
}
