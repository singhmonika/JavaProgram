package Practic;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "ABGC";
//		char[] ch = str.toCharArray();
//		
//		for(int i = ch.length-1 ; i>=0; i--) {
//			System.out.println(ch[i]);
//		}
//
//	}
		String str = "ABCD";
		char ch;
		String s = "";
		for(int i = 0 ; i<str.length(); i++) {
			ch = str.charAt(i);
			s = ch+s;
		}
		System.out.println(s);
	}

}
