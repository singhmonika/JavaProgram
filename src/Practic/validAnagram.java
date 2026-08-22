package Practic;

import java.util.Arrays;

public class validAnagram {
	
	public static boolean anagram(String str1 , String str2) {
		char [] c1 = str1.toCharArray();
		char [] c2 = str2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		str1 = String.valueOf(c1);
		str2 = String.valueOf(c2);
		
		if(str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ATEa";
		String str2 = "TEA";
		
		System.out.println(anagram(str1, str2));

	}

}
