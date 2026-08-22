package Java8Example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<List<String>> listOfLists = Arrays.asList(
		            Arrays.asList("Reflection", "Collection", "Stream"),
		            Arrays.asList("Structure", "State", "Flow"),
		            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
		        );

		        // Create a set to hold intermediate results
		        Set<String> intermediateResults = new HashSet<>();
		        
		        List<String> res = listOfLists.stream()
		        		.flatMap(List::stream)
		        		.filter(s ->s.startsWith("S"))
		        		.map(String::toUpperCase)
		        		.distinct()
		        		.sorted()
		        		.peek( s -> intermediateResults.add(s))
		        		.collect(Collectors.toList());

		        // Stream pipeline demonstrating various intermediate operations
				/*
				 * List<String> result = listOfLists.stream() .flatMap(List::stream) // Flatten
				 * the list of lists into a single stream .filter(s -> s.startsWith("S")) //
				 * Filter elements starting with "S" .map(String::toUpperCase) // Transform each
				 * element to uppercase .distinct() // Remove duplicate elements .sorted() //
				 * Sort elements .peek(s -> intermediateResults.add(s)) // Perform an action
				 * (add to set) on each element .collect(Collectors.toList()); // Collect the
				 * final result into a list
				 */
		        // Print the intermediate results
		        System.out.println("Intermediate Results:");
		        intermediateResults.forEach(System.out::println);

		        // Print the final result
		        System.out.println("Final Result:");
		        res.forEach(System.out::println);
		    }

}
