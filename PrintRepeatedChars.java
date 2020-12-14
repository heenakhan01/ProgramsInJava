import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintRepeatedChars {

	public static void main(String args[]) {
		String s= "tomatopomato";
		StringBuilder r = new StringBuilder("");
		HashMap<Character,Integer> map = new LinkedHashMap<>();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			}else {
				count=map.get(s.charAt(i));
				map.put(s.charAt(i),count+1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				r.append(entry.getKey());
			}
		}
		System.out.println(r);
		
	}
	
}
