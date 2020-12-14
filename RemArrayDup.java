import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemArrayDup {
	
		public static void main(String[] args) {
			Set<Integer> set = new LinkedHashSet<>();
			int[] arr = {1,3,4,1,5};
//
			int j=0;
			//without using any new data structure
			//we need to sort the array first
			Arrays.sort(arr);
			for(int i=0;i<arr.length-1;i++) {
				  if(arr[i]!=arr[i+1]) {
					arr[j++]=arr[i];  
				  }
				}
			arr[j++]=arr[arr.length-1];
			for(int k=0;k<j ;k++) {
				System.out.println(arr[k]);
			}
			//using Set
		/*
		 * for(int i=0;i<arr.length-1;i++) { set.add(arr[i]); }
		 */
			
			//System.out.println("Number of duplicates " + count);
		//	System.out.println(set);
			
	//Set<Integer> set = Arrays.stream(arr).collect(supplier, accumulator, combiner)	
	//	Set<Integer> r =	Arrays.stream(arr).boxed().collect(Collectors.toSet());
	//	System.out.println(r);
			
			
		}

}
