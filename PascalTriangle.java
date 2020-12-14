import java.io.PrintWriter;

public class PascalTriangle {
	
	public static void main(String args[]) {
		int n=14;
		//printPascal(n);
		printPascalUsingRecursion(n);
	}
	
	public static void printPascal(int n) {
		
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
			
				if(i==j || j==0) {
					arr[i][j]=1;
					System.out.print(" " + arr[i][j]);
				}else {
					arr[i][j]=(arr[i-1][j-1] + arr[i-1][j]);
					System.out.print(" " + arr[i][j]);
				}
				
			}
			System.out.println("");
		}
	}
	
	public static void printPascalUsingRecursion(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(pascalRecursion(i,j) + " ");
			}
			System.out.println();
		}
	}
	
	public static Integer pascalRecursion(int i,int j) {
		int result=0;
		if(j==0) {
			return 1;
		}else if(i==j) {
			return 1;
		}else {
			return pascalRecursion(i-1, j-1) + pascalRecursion(i-1, j);
		}		
	}
}
