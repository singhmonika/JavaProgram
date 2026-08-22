package Practic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	
	public static List<List<String>> groupAnagrams(String[] str){
		Map<String,List<String>> anagram = new HashMap<>();
		for(String s : str) {
			char c[] = s.toCharArray();
			Arrays.sort(c);
			String so = String.valueOf(c);
			if(!anagram.containsKey(so)) {
				anagram.put(so, new ArrayList<>());
			}
			anagram.get(so).add(s);
		}
		return new ArrayList(anagram.values());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"ate", "tea" , "mos"};
		System.out.println(groupAnagrams(arr));
		

	}

}
