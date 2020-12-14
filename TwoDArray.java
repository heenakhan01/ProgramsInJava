
public class TwoDArray {

	public static int[][] setDiagonalOneToZero(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}

	public static int[][] setDiagonalTwoToZero(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				if (i+j==arr.length-1) {
					arr[i][j] = 0;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 8, 9, 1, 4 }, 
				{ 7, 1, 3, 5 } };

		//int[][] result = setDiagonalOneToZero(arr);
		int[][] result1 = setDiagonalTwoToZero(arr);
		print(result1);

	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
