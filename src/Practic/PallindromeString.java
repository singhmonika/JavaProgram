package Practic;

public class PallindromeString {
	
	public static Boolean pallindrome(String str) {
		String strRev = "";
		for(int i = str.length()-1;i>=0;i--) {
			strRev = strRev+str.charAt(i);
		}
		if(strRev.equals(str)) {
			return true;
		}else {
		return false;
	}
	}		
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		System.out.println(PallindromeString.pallindrome(str));
		

	}

}
