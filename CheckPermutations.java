import java.util.HashMap;

public class CheckPermutations {

	public static void main(String[] args) {
		
		//1)pass null
		//2)Blueglitter,jitter
		//3)lockandkey,key
		//4)tomato ,potatopomato
		//5)squirrel,eluirsql
	
		boolean result = CheckPermutations.chkPermutation("szya", "potatopomato");
		System.out.println(result);
		
		if(result) {
			System.out.println("Strings are permutation of each other");
		}else {
			System.out.println("Str1 is not a permutation of str2");
		}
	}
	
	public static boolean chkPermutation(String str1,String str2) {
		boolean result;
		int len1= str1.length();
		int len2=str2.length();
		if(len1==0 || len2==0) {
			return false;
		}
		if(len1>len2) {
		 result=isPermutation(str1.toLowerCase(), str2.toLowerCase());
		}else {
		result= isPermutation(str2.toLowerCase(), str1.toLowerCase());
		}
		return result;
	}
	
	public static boolean isPermutation(String str1, String str2) {

		HashMap<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			Character c1 = str1.charAt(i);
			if (!map.containsKey(c1)) {
				map.put(c1, 1);
			} else {
				count = map.get(c1);
				map.put(c1, count + 1);
			}
		}
		//map.forEach((k, v) -> System.out.println("Key " + k + " Value " + v));

		for (int j = 0; j < str2.length(); j++) {
			Character c2 = str2.charAt(j);
			count = map.getOrDefault(c2, 0);
			if (count!= 0) {
				map.put(c2, --count);
			} else {
				return false;
			}
		}

		return true;
	}

}
