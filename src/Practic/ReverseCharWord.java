package Practic;

public class ReverseCharWord {
	
	public static String reversech(String s) {
		char c[] = s.toCharArray();
		String rev = "" ;
		for(int i = c.length-1; i>=0; i--) {
			rev = rev + c[i];
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reversech("My name Is Monika"));

	}

}
