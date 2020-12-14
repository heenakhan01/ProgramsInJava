import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
	
		/*
		 * Fibonacci f = new Fibonacci(); int n=12; for(int i=1;i<=n;i++) {
		 * //System.out.print( f.fibonacci(i) + " " );
		 * System.out.println(f.fibRecursion(i)); }
		 */
		
		chkPrimeUsingLambda(5);
		//System.out.println(f.chkPrime(7));
	}
	
	public static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int fibo1=1,fibo2=1,fibonacci=1;
		for(int i=3;i<=n;i++) {
			fibonacci=fibo1+fibo2;
			fibo1=fibo2;
			fibo2=fibonacci;
		}
		return fibonacci;
	}
	
	public int fibRecursion(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return fibonacci(n-1)+ fibonacci(n-2);
	}
	
	public boolean chkPrime(int n) {
		int sqrt = (int)Math.sqrt(n)+1;
		for(int i=2;i<sqrt;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	//using lambda
	public static boolean chkPrimeUsingLambda(int n){
		int n1 = 43;
		Integer i =7;
		i=i+5;
				
		String s = Integer.toString(n1);
		System.out.println(s);
	  boolean result = BigInteger.valueOf((long)n).isProbablePrime(1);
	  if(result) {
		  System.out.println("Prime");
	  }else {
		  System.out.println("Not a prime");
	  }
	return result;
		
	}
	
	
}
