package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(70);
		
		ListIterator<Integer> l1=a1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		}
	}

}
