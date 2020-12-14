import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SmallestDifferenceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestDifferenceInArray s = new SmallestDifferenceInArray();
		int[] a = {1,3,15,11,2};
		int[] b = {23,127,235,19,8};
		//System.out.println("result " + s.getDifference(a, b));
		System.out.println("result " + s.getDifference2(a, b));
	}
 // TC - O(A*B) + O(nlogN) = O(n*n);
	public static int getDifference(int[] a, int[] b) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int diff = Math.abs(a[i] - b[j]);
			//	System.out.println(diff);
				result = Math.min(diff,result);
				}
			}
			
		return result;
	}
	
	//O(AlogA+BlogB) + O(A+B);
	public static int getDifference2(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int result=Integer.MAX_VALUE;
		int i=0,j=0;
		while(i< a.length && j< b.length) {
		   int diff = Math.abs(a[i]-b[j]);
		   result = Math.min(diff, result);
			if(a[i]<b[j]) {
				i++;
			}else {
				j++;
			}
		}
		return result;
	}
}
