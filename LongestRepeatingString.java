import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LongestRepeatingString {

	public static String getLongestRepeatingString(String s) {
		//xyzaaabbbbctl
		int maxlength=1, maxIndex=0, startIndex=0, count=1;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				count++;
			} else {
				if(maxlength<count) {
					maxlength=count;
					maxIndex = startIndex;
					
				}
				count=1;
				startIndex = i;
			}
		}
		return s.substring(maxIndex, maxIndex+maxlength);
		
	}
	
	public static int[] reverseArray(int[] arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}

	public static String reverseString(String s) {
		char[] arr = s.toCharArray();
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return new String(arr);
	}
	
	public static String getMaxVotes(String[] arr) {
		String result ="";
		HashMap<String,Integer> freq = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i])+1);
			}else {
				freq.put(arr[i],1);
			}
		}
		int count=0;
		for(Map.Entry<String, Integer> entry : freq.entrySet()) {
			int currVal = entry.getValue();
			 if(currVal>count) {
				 count=currVal;
			  result=entry.getKey();
			 }
		}
		return result;
	}
	
	public static String getSecondMaxVotes(String[] arr) {
		String result ="";
		Map<String,Integer> freq = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(freq.containsKey(arr[i])) {
				freq.put(arr[i], freq.get(arr[i])+1);
			}else {
				freq.put(arr[i],1);
			}
		}
		List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
		Collections.sort(list, (o1,o2)-> o2.getValue().compareTo(o1.getValue()));
		Entry<String, Integer> secondMax = list.get(list.size()-2);
		for(String s : freq.keySet()) {
			if(freq.get(s)==secondMax.getValue()) {
				result = s;
			}
		}
		return result;
		}
	public static void main(String[] args) {
		/*
		 * String s = "xyzaaabbbbbtlc";
		 * System.out.println(getLongestRepeatingString(s)); int[] arr =
		 * {3,4,5,6,7,8,9}; int[] result = reverseArray(arr);
		 * System.out.println(Arrays.toString(result));
		 * System.out.println(reverseString("Codinginterview"));
		 */
		String[] fruits = {"apple", "mango","mango", "mango", "mango", "apple", "orange"};
		//System.out.println(getMaxVotes(fruits));
		System.out.println("Input String is" + Arrays.toString(fruits));
		System.out.println("Second Max String is " + getSecondMaxVotes(fruits));
	}

}

