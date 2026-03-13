package Assignments;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsMethods {
public static void main(String[] args) {
		ArrayList<Integer> c1=new ArrayList<Integer>();
		c1.add(36);
		c1.add(44);
		c1.add(34);
		c1.add(64);
		System.out.println(c1);
		ArrayList<Integer> c2=new ArrayList<Integer>();
		c2.add(35);
		c2.add(45);
		c2.add(55);
		c2.add(65);
		System.out.println(c2);
		Collections.sort(c1);
		System.out.println(c1);
		Collections.reverse(c2);
		System.out.println(c2);
System.out.println(Collections.max(c1));
System.out.println(Collections.min(c2));
System.out.println(Collections.frequency(c1,36));
System.out.println(Collections.binarySearch(c1,36));
Collections.rotate(c2,1);
System.out.println("rotated-->"+c2);
Collections.unmodifiableList(c2);
System.out.println(c2);
Collections.replaceAll(c2,55,72);
System.out.println(c2);
boolean d1=Collections.disjoint(c1, c2);
System.out.println(d1);
Collections.fill(c1, 22);
System.out.println(c1);
Collections.copy(c1, c2);
System.out.println(c2);


	}

}
