package Assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListProgram {
public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
a1.add(20);
a1.add(40);
a1.add(35);
a1.add(45);
a1.add(55);
a1.add(65);
System.out.println(a1);
 ArrayList<Integer> b1=new ArrayList<Integer>();
 b1.add(32);
 b1.addAll(0,a1);
 System.out.println(b1);
 b1.remove(0);
 System.out.println(b1);
 b1.removeAll(a1);
 System.out.println(b1);
 boolean b2=b1.contains(55);
 System.out.println(b2);
 Integer c1= b1.get(0);
 System.out.println(c1);
 System.out.println("Iterator usage");
 Iterator<Integer> d1=a1.iterator();
 while(d1.hasNext()) {
	 System.out.println(d1.next());
 }
 System.out.println("List Iterator usage");
 ListIterator<Integer> s1=a1.listIterator();
 while(s1.hasNext()) {
	 System.out.println(s1.next());
 }
		 }

}
