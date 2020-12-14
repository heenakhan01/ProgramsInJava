
public class CheckPalindrome {
	public static void main(String args[]) {
		String s="Madam";	
		char[] c = s.toLowerCase().toCharArray();
		int i=0;
		int j=c.length-1;
		int flag=0;
		while(i<=j) {
			if(c[i]!=c[j]) {
				flag=1;
			}
			i++;
			j--;
		}
		
		if(flag==1) {
			System.out.println("Not a palindrome");
		}
		else {
			System.out.println("Palindrome");
		}
		
	}

}
