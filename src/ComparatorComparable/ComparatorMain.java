package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> ls1 = new ArrayList<>();
		ls1.add(new Employee(3,"abc"));
		ls1.add(new Employee(2,"bcd"));
		
		Collections.sort(ls1,new CompatorId());
		
		System.out.println(ls1);
		
		List<Employee> ls2 = new ArrayList<>(ls1);
		Collections.sort(ls2,new ComparatorName());
		System.out.println(ls2);
	}

}
