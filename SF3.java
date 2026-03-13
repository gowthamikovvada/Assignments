package Assignments;
import java.util.Arrays;
public class SF3 {
public static void main(String[] args) {
		String name="Gowthami Kovvada";
		String[] name1=name.split(" ");
		String[] name3=name.split(" ",1);
		System.out.println(Arrays.toString(name3));
		System.out.println(Arrays.toString(name1));
		String name2=name.repeat(10);
System.out.println(name2);
int name4=name.lastIndexOf('a');
System.out.println(name4);
boolean name5=name.startsWith("D",0);
System.out.println(name5);
boolean name6=name.endsWith("a");
System.out.println(name6);
boolean name7=name.isBlank();
System.out.println(name7);
boolean name8=name.isEmpty();
System.out.println(name8);
}
}
