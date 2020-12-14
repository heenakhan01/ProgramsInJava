
public class StringReverse {
	
	public static void main(String[] args) {
		
		  String s = "Hello"; //validations 
		/*
		 * if(s==null || s.isEmpty()) { System.out.println("Invalid data"); } String
		 * result =""; int n=s.length()-1; for(int i=n;i>=0;i--) { result = result +
		 * s.charAt(i); } System.out.println(result);
		 * 
		 * StringReverse.usingAPI("cat");
		 * 
		 * System.out.println(revStr("Hello"));
		 */
		System.out.println(recursiveReverse(s));
		    
	}
	
	//using StringBuilder and StringBuffer
	
	public static void usingAPI(String s) {
		String s1 = new StringBuilder(s).reverse().toString();
System.out.println("Sb " + s1);
		String s2 = new StringBuffer(s).reverse().toString();
		System.out.println("sbuf " + s2);
	}
	
	public static String revStr(String s) {
	
		char[] arr = s.toCharArray();
		int i = 0;
		int j=arr.length-1;
		char temp;
		while(i<j) {
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
		}
		
		String r = new String(arr);
		return r;
		
	}
	
	public static String recursiveReverse(String s) {
		if(s.length()<2)
			return s;
	
		System.out.println(s.substring(1));
		return recursiveReverse(s.substring(1)) + s.charAt(0);
	}

}
