package Assignments;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapProgram {
public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
m1.put(234,"Gowthami");
m1.put(546,"Amruth");
m1.putIfAbsent(654,"Amruth");
System.out.println(m1);
Map<Integer,String> m2=new HashMap<Integer,String>();
m2.put(235,"Gowthu");
m2.put(547,"Riya");
m2.putAll(m1);
System.out.println(m2);
boolean b1=m1.isEmpty();
System.out.println(b1);
boolean b2=m2.containsKey(235);
System.out.println(b2);
boolean b3=m2.containsValue("Riya");
System.out.println(b3);
String c1=m2.get(547);
System.out.println(c1);
m2.remove(235);
System.out.println(m2);
m1.replace(546,"Riyanshika");
System.out.println(m1);

Set<Integer> s1=m1.keySet();
for(Integer i1:m1.keySet()) {
	System.out.println(i1);
}
Collection<String> s2=m1.values();
for(String i2:m1.values()) {
	System.out.println(i2);
}
Set<Entry<Integer,String>> s3=m1.entrySet();
for(Entry<Integer,String> i3:m1.entrySet()) {
	System.out.println(i3);
}
Iterator<Entry<Integer,String>> s4=s3.iterator();
while(s4.hasNext()) {
	System.out.println(s4.next());
}
	}
	

}
