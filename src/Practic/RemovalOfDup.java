package Practic;

import java.util.HashSet;
import java.util.Set;

public class RemovalOfDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDHBC";
		Set<Character> s = new HashSet<>();
		for(int i = 0; i<str.length();i++) {
			s.add(str.charAt(i));
		}
		
		System.out.println(s);

	}

}
