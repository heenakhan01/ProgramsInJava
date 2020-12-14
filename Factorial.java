
public class Factorial {

	public static void main(String args[]) {
		int number = 4;
		int result =1;
		while(number!=0) {
			result=result*number;
			//System.out.println(result);
			number--;
		}
			//System.out.println(Factorial.facRecursion(4));
			int[] list = {4,6,23,78,89,4,6,2};
			
	System.out.println(findMax(list));
		
		
	}
	
	public static int facRecursion(int n) {
		if(n==0) {
			return 1;
		}
		return n*facRecursion(n-1);
		
	}
	
	public static int findMax(int[] list) {
		int max=0;
		for(int i=0;i<list.length;i++){
		  if(list[i] > max){
		    max=list[i];
		}
		}
		return max;
	}
}
