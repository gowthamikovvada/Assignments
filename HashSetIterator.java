package Assignments;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String>();
		s1.add("Gowthami");
		s1.add("Amruth");
		s1.add("Riya");
		s1.add(null);
		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext()) {
			if(i1.next()==null) {
				i1.remove();
			}
			
		}
		System.out.println(s1);

	}

}

