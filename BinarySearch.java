import java.util.Arrays;

public class BinarySearch {

	public static void main(String arggs[]) {
		int[] arr = { 12, 34, 10, 54, 24, 90, 87 };
		//{10,12,24,34,54,87,90}
		int k = 12;
		int l = 0, r = arr.length - 1;

		System.out.println(binSearch(arr,l,r,k));

	}

	public static int binSearch(int[] arr, int l, int r, int k) {
		Arrays.sort(arr);
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] > k) {
				return binSearch(arr,l,mid-1,k);
			} 
				return binSearch(arr, mid+1, r, k);
			
		}
		return -1;
	}

}
