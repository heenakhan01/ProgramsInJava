import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class MissingNumber {
	
	public static int getMissingNumber(int[] arr) {
		
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]!=1) {
				return (arr[i+1]-1);
			}
		}
		
		return -1;
	}
	
	public static int getMissingNumber2(int[] arr) {
		int n=arr.length+1;
		int actualSum=0;
		int expectedSum=n*(n+1)/2;
		int missingNum=-1;
		for(int i=0;i<arr.length;i++) {
			actualSum+=arr[i];
		}
		if(actualSum==0 || arr.length==0) {
			return missingNum;
		}else {
			missingNum=expectedSum-actualSum;
			return missingNum;
		}
		
	}

	public static void main(String[] args) {

		int[] arr = {3,7,1,2,8,4,5};
		int[] arr1 = {49,44,47,42,46,50,41,45,43};
		//System.out.println(getMissingNumber(arr));
		System.out.println(getMissingNumber(arr1));
		System.out.println(getMissingNumber2(arr1));

	}

}
