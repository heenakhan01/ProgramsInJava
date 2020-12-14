
public class AddStrings {

	public static String addStrings(String s1,String s2) {
		StringBuilder sb = new StringBuilder();
		//keep counter at the last character of both strings
		//assign carry as 0;
		//iterate through the strings and substract 0 from each character
		
		int i=s1.length()-1;
		int j=s2.length()-1;
		int carry=0;
		while(i>=0 || j>=0) {
			int sum=carry;
			if(i>=0) {
				sum+=s1.charAt(i)-'0';
				i--;
			}
			if(j>=0) {
				sum+=s2.charAt(j)-'0';
				j--;
			}
			sb=sb.append(sum%10);
			carry=sum/10;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(addStrings("1234", "1234"));
	}

}
