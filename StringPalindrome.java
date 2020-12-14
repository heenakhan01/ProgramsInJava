
public class StringPalindrome {
	
	public static void main(String[] args) {
		String test = "madam";
		char[] arr = new char[test.length()];
				arr = test.toCharArray();
		
		int i=0;
		int flag=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				flag=1;
				break;
			}
			i++;
			j--;
	}
		
		if(flag==1) {
			System.out.println("Not a PAlindrome");
		}else {
			System.out.println("palindrome");
		}
		
		//System.out.println(StringPalindrome.isNumberPalindrome(101));
		
	}
	
	public static boolean isNumberPalindrome(int n) {
		int rev=0;
		int p=n;
		while(p!=0) {
			int remainder=p%10;
			System.out.println("remainder " + remainder);
			rev=rev*10 +  remainder;
			System.out.println("rev"  + rev);
			p=p/10;
			System.out.println("palindrome" + p);
		}
		
		if(n==rev) {
			return true;
		}
		return false;
		
	}
}
