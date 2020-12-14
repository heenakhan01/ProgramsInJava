import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsOfP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s =  "cbaebabacd";
		String p = "abc";
		System.out.println(getAllAnagramsOfP(s, p));
	}

	public static List<Integer> getAllAnagramsOfP(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		int[] b1 = new int[26];
		int[] b2 = new int[26];
		for(char c : p.toCharArray()) {
			b2[c-'a']++;
		 System.out.println(c);
		}
		int j=0;
		for(int i=0;i<s.length();i++) {
			b1[s.charAt(i)-'a']++;
			while(i-j+1>p.length()) 
				b1[s.charAt(j++)-'a']--;
			
			if(Arrays.equals(b1,b2)) 
				list.add(j);
			
			
		}
		return list;
	}
}
