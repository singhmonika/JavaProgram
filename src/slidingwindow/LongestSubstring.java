package slidingwindow;


import java.util.*;

public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		int left =0, maxlength = 0;
		Set<Character> charset = new HashSet<>();
		for(int right = 0; right<s.length();right++) {
			while(charset.contains(s.charAt(right))) {
				charset.remove(s.charAt(left));
				left++;
			}
			charset.add(s.charAt(right));
			maxlength = Math.max(maxlength, (right-left)+1);
		}
		return maxlength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabcbb";
		LongestSubstring l = new LongestSubstring();
		System.out.println(l.lengthOfLongestSubstring(s));

	}

}
