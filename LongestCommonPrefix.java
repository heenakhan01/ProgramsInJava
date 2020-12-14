import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] s = { "flower", "flow", "flight" };
		//System.out.println("Solution is " + method1(s));
		// not working
		System.out.println("Solution is " + method2(s));

			}
   public static String method1(String[] s) {
	   ArrayList<String> list = new ArrayList<>();
		String result = "";

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				String v1 = s[i];
				System.out.println(v1);
				String v2 = s[j];
				System.out.println(v2);
				int idx1 = 1, idx2 = 1;
				while (idx1 <= v1.length() && idx2 <= v2.length()) {
					String prefix1 = v1.substring(0, idx1);
					System.out.println("Prefix1 " + prefix1 );
					String prefix2 = v2.substring(0,idx2);
					System.out.println("Prefix2 " + prefix2);
					if ((prefix1).equals(prefix2)) {
						result = prefix1;
						System.out.println("Result " +result);
						
					}else {
						break;
					}
					idx1++;
					idx2++;
				}
				list.add(result);

				
			}
			
		}
		
		Collections.sort(list,(o1,o2)->o1.length()-o2.length());
		System.out.println(list);
		 if(list.size()!=0){
	            return list.get(0);
	        }else{
	            return "";
	        }
	        
   }
   
   public static String method2(String[] strs) {
	   String result = "";
       int index=0;
        for(char c: strs[0].toCharArray()){
           for(int i=1;i<strs.length;i++){
        	   String t = strs[i];
        	   int t1 = strs[i].length();
        	   char d = strs[i].charAt(index);
               if(index>t1 || c!=d){
                   return result;
               }
           } 
            result+=c;
            index++;
        }
        return result;
 	   }
}
