package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> ls = new ArrayList<>();
		ls.add(new Emp(3,"Monika"));
		ls.add(new Emp(2,"Monu"));
		Collections.sort(ls);
		System.out.println(ls);
	}

}
