package Practic;

import java.util.HashMap;
import java.util.Map;

public class OccurenceCharc {
	public static void occurence(String str) {
		Map<Character, Integer> mp = new HashMap<>();
		for(int i = 0;i<str.length();i++) {
			if(mp.containsKey(str.charAt(i))) {
				mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
			}else {
				mp.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(mp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aacrbr";
		OccurenceCharc.occurence(str);
	}

}
