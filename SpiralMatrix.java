
public class SpiralMatrix {
	
	public static void print(int[][] arr) {
		int t=0;
		int b=arr.length-1;
		int l=0;
		int r=arr[0].length-1;
		int i=0;
		int dir =0;
		
		while(t<=b && l<=r) {
			
			if(dir==0) {
				for(i=0;i<=r;i++) {
					System.out.print(arr[t][i] + " ");
				}
				t++;
				System.out.println("");
			}
			else if(dir==1){
				for(i=t;i<=b;i++) {
					System.out.print(arr[i][r] + " ");
				}
				r--;
				System.out.println("");
			}else if(dir==2) {
				for(i=r;i<=l;i--) {
					System.out.print(arr[b][i] + " ");
				}
				b++;
				System.out.println("");
			}else if(dir==3) {
				for(i=b;i>=t;i--) {
					System.out.print(arr[i][l] + " ");
				}
				l++;
				System.out.println("");
				dir = (dir+1)%4;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		print(arr);
	}

}
