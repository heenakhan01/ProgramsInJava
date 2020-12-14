
public class ReverseArray {
	
	public static void main(String args[]) {
		int[] arr= {2,80,6,3,70,45,6,7};
		int[] result = reverseArray(arr);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	public static int[] reverseArray(int[] arr) {
		
		int i=0;
		int j=arr.length-1;
		int temp=0;
		while(i<j) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
		return arr;
		
	}

}
