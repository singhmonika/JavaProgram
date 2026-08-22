package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("Geek","ABC", "AGBS");
		Predicate<String>ps = s ->s.startsWith("G");
		Consumer<String>cs = t -> System.out.println("Its a consumer");
		for(String st : ls) {
			if(ps.test(st)) {
				System.out.println(st);
		}

	}

	}
}
