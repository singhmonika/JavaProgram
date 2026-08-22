package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>ls = Arrays.asList("SDF","DFG");
		List<String> result = ls.stream()
				.filter(S->S.startsWith("D"))
				.collect(Collectors.toList());
		
		System.out.println(result);

	}

}

