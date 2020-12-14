import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IndexPairsOfString {
	public static int[][] indexPairs(String text, String[] words) {
        List<Integer[]> list = new ArrayList<>();
        for (String word: words){
        	int firstIndex = 0;
        	while (text.indexOf(word, firstIndex) != -1){
        		int start = text.indexOf(word, firstIndex);
        		Integer[] arr = {start, start + word.length() - 1};
        		list.add(arr);
        		firstIndex = start + 1;
        	}
        }
        Collections.sort(list, (p1,p2)->(p1[0] == p2[0]?p1[1] - p2[1]:p1[0] - p2[0]));
         int[][] res=  print(list);
           return res; 
    }

	public static int[][] print(List<Integer[]> list) {
		
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++){
        	res[i] = new int[]{list.get(i)[0], list.get(i)[1]};
        }
        return res;
     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = {"aba","ab"};
		String text = "ababa";
		int[][] res= indexPairs(text,words);
       for(int i=0;i<res.length;i++) {
    		   System.out.print(res[i][0] + " " + res[i][1]);
    		   System.out.println("");

    	   
       }
}
	
}	
