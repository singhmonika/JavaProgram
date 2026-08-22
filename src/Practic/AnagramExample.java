package Practic;

import java.util.*;

public class AnagramExample {
	
	public static List<String> funWithAnagram(List<String> words){
		Set<String> seen = new HashSet<>();
		List<String> result = new ArrayList<>();
		for(String word : words) {
			String sorted = sortVal(word);
			if(!seen.contains(sorted)) {
				seen.add(sorted);
				result.add(word);
				System.out.println("Is Anagram");
			}
		}
		return result;
	}
	
	private static String sortVal(String words) {
		char[] chars = words.toCharArray();
		Arrays.sort(chars);
		return new String (chars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input = Arrays.asList("code", "doce","mde","sde");
		List<String> output = funWithAnagram(input);
		System.out.println(output);

	}

}
