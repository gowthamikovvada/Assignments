package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListIntoSet {

	public static void main(String[] args) {
		List<Integer>i1=new ArrayList<Integer>();
i1.add(61);
i1.add(61);
i1.add(72);
i1.add(57);
System.out.println(i1);
List<Integer>i2=new ArrayList<Integer>();
i2.add(65);
i2.add(68);
i2.add(76);
i2.add(null);
i2.addAll(i1);
System.out.println(i2);

System.out.println(i2.removeAll(null));

	}

}
