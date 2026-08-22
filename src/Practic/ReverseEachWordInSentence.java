package Practic;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MY NAME IS MONIKA";
		String rev ="";
		
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		
		
	}

}
