package Assignments;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class CollectionProperties {
public static void main(String[] args) {
		Collection<Integer> c1=new ArrayList<Integer>();
c1.add(34);
c1.add(44);
c1.add(54);
c1.add(64);
System.out.println(c1);
c1.remove(34);
System.out.println(c1);
boolean b2=c1.contains(64);
System.out.println(b2);
Iterator<Integer> k1=c1.iterator();
while(k1.hasNext()) {
	System.out.println(k1.next());
}
c1.clear();
System.out.println(c1);
boolean b1=c1.isEmpty();
System.out.println(b1);

	}

}
