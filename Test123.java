
public class Test123 {
	
	    public static int countSegments(String s) {
	        System.out.println(s);
	        String trimmed = s.trim();
	                System.out.println(s);

	        if (trimmed.equals("")) {
	            return 0;
	        }
	         String[] r =trimmed.split("\\s+");
	                System.out.println(r.toString());

	        return trimmed.split("\\s+").length;
	    }
	 public static void main(String args[]) {
		 int len = countSegments("Hello, It is a string");
		 System.out.println(len);
	 }
}
