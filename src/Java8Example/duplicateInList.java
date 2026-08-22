package Java8Example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class duplicateInList {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(2,6,2,7,3,6);
		Set<Integer> s = new HashSet<>();
		ls.stream()
		.filter(n->!s.add(n))
		.forEach(System.out::println);
	}
}
