
public class ShiftStrings {
	public static String shiftStrings(String s,int[][] arr) {
		int val=0;
		for(int i=0;i<arr.length;i++) {
			val+=arr[i][0]==0?-arr[i][1]:arr[i][1];
		}
		System.out.println(val);
		int len= s.length();
		val=val%len;
		System.out.println(val);
		if(val>0) { //right rotation
			return s.substring(len-val)+s.substring(0,len-val);
		}else { //left rotation
			return s.substring(0-val,len)+s.substring(0,0-val);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,1},{1,1},{0,2},{0,3}};
		System.out.println(shiftStrings("abcdefg", arr));
	}

}
