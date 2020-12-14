public class Solution1 {
	public int search(int[] nums, int target) {
		if (nums.length == 0 || nums == null) {
			return -1;
		}

		int start = 0;
		int end = nums.length - 1;
		int pivot = findPivot(nums, start, end);

		 if (target >= nums[pivot] && target <= nums[end]) {
			return binarySearch(nums, pivot, end, target);
		} else {
			return binarySearch(nums, start, pivot - 1, target);
		}
		
	}

	public int findPivot(int[] nums, int start, int end) {
		if (end >= start) {
			int m = start + (end - start) / 2;

			if (nums[m] > nums[m + 1]) {
				return m + 1;
			} else {
				if (nums[start] > nums[m]) {
					return findPivot(nums, start, m - 1);
				} else {
					return findPivot(nums, m + 1, end);
				}
			}
		}
		return -1;
	}

	public int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == x)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	public static void main(String args[]) {
		int[] nums = {1,3};
		int target = 0;
		Solution1 s = new  Solution1();
		int r =s.search(nums, target);
		System.out.println(r);
	}
}