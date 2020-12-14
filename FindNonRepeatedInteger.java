import java.util.HashSet;

public class FindNonRepeatedInteger {
	
	public static int getNum(int[] arr) {
		
		HashSet<Integer> set  = new HashSet<>();
		int result=0;
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				set.remove(arr[i]);
			}else {
				set.add(arr[i]);
			}
		}
		for(Integer i : set) {
			 result = i;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,2,3,1,5};
	    System.out.println(getNum(arr));
	}

}
