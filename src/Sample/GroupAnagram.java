package Sample;

import java.util.*;

public class GroupAnagram {
	
	 public List<List<String>> groupAnagrams(String[] strs) {
		 Map<String,List<String>>mp = new HashMap<>();
		 List<List<String>> ls = new ArrayList<>();
		 for(String s : strs) {
			 char[] ana = s.toCharArray();
			 Arrays.sort(ana);
			 String k = String.valueOf(ana);
			 if(!mp.containsKey(k)) {
				 mp.put(k, new ArrayList<>());
			 }
			 mp.get(k).add(s);
			 
			 
		 }
		 	for(Map.Entry<String,List<String>>entry : mp.entrySet() ) {
		 		ls.add(entry.getValue());
		 	}
		 return ls;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		GroupAnagram ga = new GroupAnagram();
		System.out.println(ga.groupAnagrams(str));

	}

}
