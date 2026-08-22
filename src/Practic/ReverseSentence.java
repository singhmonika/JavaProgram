package Practic;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Monika The";
		String[] word = str.split("\\s");
		String rev = "";
		
		for(int i = word.length-1;i>=0;i--) {
			rev = rev + word[i] + " ";
		}
		System.out.println(rev);
		int total = (word.length+1)/2;
		System.out.println(total);

	}

}
