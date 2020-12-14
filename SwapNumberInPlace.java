
public class SwapNumberInPlace {

	public static void main(String[] args) {
		swapNumberInPlace(10, 20);
	}
	public static void swapNumberInPlace(int a,int b) {
		a=a+b; // a= 30
		b=a-b;//b=10;
		a=a-b;//a=20
		System.out.println("a " +a + " b "+ b);
	}

}
