import java.util.ArrayList;
import java.util.List;

public class MissinRanges {
	
	public static List<String> getMissingRange(int[] nums, int lower, int upper){
		List<String> result = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>lower) {
				if(nums[i]-lower==1) {
					result.add(lower+ "");
				}else {
					result.add(lower+"->"+(nums[i]-1));
				}
			}
			if(nums[i]==Integer.MAX_VALUE) {
				return result;
			}
			lower=nums[i]+1;
		}
		if(lower<upper) {
			result.add(lower + "->" +upper);
		}
		else if(lower==upper){
			result.add(lower+ "");
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0,1,3,50,75};
		int lower =0;
		int upper = 99;
		System.out.println(getMissingRange(nums, lower, upper));
		System.out.println(Integer.MAX_VALUE);
	}

}
