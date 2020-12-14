
public class ReplaceSpace {
	
	public static String  replaceSpace(String str,int n) {
	 StringBuilder result= new StringBuilder("");
	 int count=0;
	 if(str==null) {
		 return "Invalid input";
	 }
		char[] arr =str.toCharArray();
	  for(int i=0;i<arr.length;i++) {
		 
		  if(arr[i]==' ') {
			  count++;
		  }else {
			  if(count>0) {
				  result.append("%20");
			  }
			  result.append(arr[i]);
			  count=0;
		  }
		  
	  }
		
		return result.toString();
	}
	
	public static void main(String args[]) {
		
		System.out.println(replaceSpace("Mr John Smith", 13));
	}

}
