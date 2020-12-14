import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PalindromePermutation {

	public static void main(String args[]) {
		//System.out.println(chkPalindromePermutation("atcot cta"));
		System.out.println(chkPalidromeUsingSet("bobaao"));
	
	}
	

	public static boolean chkPalindromePermutation(String r) {
		String s=r.replaceAll("\\s", "").toLowerCase();
		System.out.println(s);
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				if (map.get(c) == 1) {
					map.put(c,0);
				}else {
					map.put(c,1);
				}
			}
		}
		
		boolean foundOdd = false;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		       int value = entry.getValue();
		       if(value%2==1) {
		    	   if(foundOdd) {
		    		   return false;
		    	   }
		    	   foundOdd=true;
		       }

		}
		return true;

	}
	
	public static boolean chkPalidromeUsingSet(String s) {
		String r = s.replaceAll("\\s", "").toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<r.length();i++) {
			Character c = r.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
			}else {
				set.remove(c);
			}
		}
		if((set.size()==1 && r.length()%2==1) || (set.size()==0 && r.length()%2==0)) {
			return true;
		}
		
		return false;
	}

}
