package Practic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "cbaebabacd";
		String s1 = "abc";
		char [] arrs = s.toCharArray();
		char [] arrs1 = s1.toCharArray(); 
		Arrays.sort(arrs1);
		String n = Arrays.toString(arrs1);
		int s1length = s1.length();
		int slength = s.length();
		
		List<Integer> ls = new ArrayList<>();
		
		for(int i =0 ; i<s.length()-1;i++) {
			if(slength>=s1length) {
		String result = s.substring(i, s1length);
		char [] res = result.toCharArray();
		Arrays.sort(res);
		String r = Arrays.toString(res);
		if(r.equals(n)) {
			ls.add(i);
			System.out.println(ls);
		}
		slength--;
			}
		}
		
	}

}
