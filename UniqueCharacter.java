
public class UniqueCharacter {
	
	public static void main(String args[]) {
		//PeterPam,hackern
		String str = "hackern";
		boolean flag=true;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					flag=false;
				}
			}
		}
		
		if(flag) {
			System.out.println("string has unique characters");
		}else {
			System.out.println("string does not have unique characters");

		}
	}

}
