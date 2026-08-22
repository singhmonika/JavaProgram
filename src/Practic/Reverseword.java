package Practic;

import java.util.Scanner;

public class Reverseword {
	public static String rev(String s) {
		char ch[] = s.toCharArray();
		String reverse ="";
		for(int i = ch.length-1; i>=0; i--) {
			reverse = reverse + ch[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		System.out.println(rev(str));

	}

}
