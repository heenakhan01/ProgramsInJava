
public class GCDUsingRecursion {

	public static void main(String args[]) {
		System.out.println(getGCD(3, 7));
	}
	
	public static int getGCD(int n1,int n2) {
		if(n2==0) {
			return n1;
		}
		return getGCD(n2,n1%n2);
	}
}
