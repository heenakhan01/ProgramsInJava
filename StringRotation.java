import java.util.HashMap;
import java.util.Map;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubString("waterbottle", "yyy"));
		System.out.println(isSubString("waterbottle", "erbottlewat"));


	}
	
	public static HashMap<Character,Integer> getCount(String s1) {
		HashMap<Character, Integer> map = new HashMap<>();
		int count=0;
		for(int i=0;i<s1.length();i++) {
			Character ch = s1.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				count=map.get(ch);
				map.put(ch,count+1);
			}
		}		
		
		return map;
		
	}
	
	public static boolean isSubString(String s1,String s2) {
		String first = s1.length()<s2.length() ? s1: s2;
		String second =s1.length()<s2.length() ?s2: s1;
		HashMap<Character,Integer> map1 = getCount(s1);
		HashMap<Character,Integer> map2 = getCount(s2);
		int count =0;
		for(Character one : map1.keySet()) {
			if(map2.keySet().contains(one)) {
				count++;
			}
		}
		
		if(count==map1.size()) {
			return true;
		}
		
		return false;
	}

}
