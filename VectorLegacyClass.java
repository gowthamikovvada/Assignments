package Assignments;

import java.util.Enumeration;
import java.util.Vector;

public class VectorLegacyClass {

	public static void main(String[] args) {
		Vector<Character> v1=new Vector<Character>();
v1.addElement('A');
v1.add(0,'C');
v1.addElement('B');
Vector<Character> v2=new Vector<Character>();
v2.addAll(0,v1);
v2.addElement('F');
System.out.println(v2);
Enumeration<Character> e1=v1.elements();
while(e1.hasMoreElements()) {
	System.out.println(e1.nextElement());
}
	}

}
