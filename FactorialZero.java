
public class FactorialZero {

	public static void main(String[] args) {
// 5 -> 5.4.3.2.1=720 o/p -> 1
	//	System.out.println(getZeroCount(12));
		System.out.println(countZero1(12));
	}
	public static int getFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return (getFactorial(n-1) * n);
	}
	public static int getZeroCount(int n) {
		int count=0;
		
		n=getFactorial(n);
		while(n%10==0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	public static int getCount1(int i) {
		int count=0;
		while(i%5==0) {
			count++;
			i/=5;
		}
		return count;
	}
	
	public static int countZero1(int n) {
		int count=0;
		for(int i=2;i<=n;i++) {
			count+=getCount1(i);
		}
		return count;
	}

}
