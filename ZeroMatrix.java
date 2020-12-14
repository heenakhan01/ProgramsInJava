import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZeroMatrix {

	public static void main(String args[]) {
		HashSet<Integer> rows = new HashSet<>();
		HashSet<Integer> columns = new HashSet<>();
		int[][] matrix = { { 1, 2, 3, 4 }, 
				{ 4, 9, 6 , 7}, { 7, 8, 9, 6 }, {1, 0, 3, 1}};
		print(matrix);
		System.out.println();
		setZeroMatrix(rows, columns, matrix);
	}

	public static void getIndices(Set<Integer> set1, Set<Integer> set2, int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 0) {
					set1.add(i);
					set2.add(j);
				}

			}
		}
	}

	public static void setZeroMatrix(Set<Integer> set1, Set<Integer> set2, int[][] m) {

		getIndices(set1, set2, m);
		for(Integer row : set1) {
			for(int j=0; j<m[row].length; j++) {
				m[row][j] = 0;
			}
		}
		for(Integer column : set2) {
			for(int i=0; i<m.length; i++) {
				m[i][column] = 0;
		
			}
		}
		
		print(m);
	}
	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			}
			System.out.println("");
		}
	}

}
