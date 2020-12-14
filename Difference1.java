import java.util.HashSet;
import java.util.Set;

public class Difference1 {

	// find out how many pairs exists that have a difference K=2, in given array
	// {1,7,5,9,2,12,3}

	public static void main(String args[]) {
		int[] arr = { 1, 7, 5, 9, 12, 3 };
		int k = 2;
		// int result = getDifference(arr, k);
		// System.out.println("No of pairs are " + result);
		System.out.println(getDifference1(arr, k));

	}

	public static int getDifference(int[] arr, int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (Math.abs(arr[i] - arr[j]) == k) {
					count++;
					System.out.println("Pairs " + "(" + arr[i] + " , " + arr[j] + ")");
				}
			}
		}

		return count;

	}

	public static int getDifference1(int[] arr, int k) {
		int count = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
			int diff1 = arr[i] + k;
			int diff2 = arr[i] - k;
			System.out.println("diff1" + diff1);
			System.out.println("diff2" + diff2);
			if (set.contains(diff1) ) {
				count++;
			}
			if(set.contains(diff2)) {
				count++;
			}
		}

		return count;
	}
}
