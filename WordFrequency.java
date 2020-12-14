import java.util.HashMap;

public class WordFrequency {

	public static void main(String[] args) {
		String text = "When I was in college studying computer science, "
				+ "as well as after I graduated and there started my career "
				+ "as a software developer, there was a pervasive idea. "
				+ "I don’t think there anyone said it outright,there, but it was definitely ";
	
		//System.out.println(getFreq(text, "there"));
		HashMap<String,Integer> map= new HashMap<>();
		System.out.println(getFreq2(text, "there",map));

	}
	public static int getFreq(String text, String word) {
		int count =0;
		String[] words = text.split("\\s");
		//check if we have to ignore the case 
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(word)) {
				count++;
			}
		}
		return count;
		
		//TC - O(n) n is the no of words in text;
	}
	
	public static int getFreq2(String text,String word,HashMap<String,Integer> map) {
		//1.Store everything in HashMap and then lookup the specific word freq
		//O(1) to check multiple times and space complexity O(n) n is the number of words in string
	    int count=0;
	    if(word.length()==0 || word==null) {
	    	return 0;
	    }
	    map = getMappingOfFreq(text);

	    if(map.size()==0) {
	    	return 0;
	    }
	    count =map.get(word);
	    return count;
		
	}

	public static HashMap<String,Integer> getMappingOfFreq(String text){
		HashMap<String,Integer> map = new HashMap<>();
		String[] words = text.trim().toLowerCase().split(" ");
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			}else {
				map.put(words[i], 1);
			}
		}
		return map;
	}
}
