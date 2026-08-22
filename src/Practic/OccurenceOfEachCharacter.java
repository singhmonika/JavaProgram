package Practic;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter {
	
	public static Map<Character, Integer> occurence(String s) {
		Map<Character, Integer> count = new HashMap<>();
		for(char c : s.toCharArray()) {
			int occ = 1;
			if(count.containsKey(c)) {
				count.put(c, occ+1);
			}else {
				count.put(c, occ);
			}
			
				//count.put(c, count.getOrDefault(c, 0)+1);
		}
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "baaajjg";
		System.out.println(occurence(s));

	}

}
