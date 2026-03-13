package mathmethod;

import java.util.Scanner;

public class HumanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("enter the string value");
String a=s1.next();
System.out.println(a);

int b=s1.nextInt();
System.out.println("enter the int value");
System.out.println(b);
byte c=s1.nextByte();
System.out.println(c);
long d=s1.nextLong();
System.out.println(d);
short e=s1.nextShort();
System.out.println(e);
double f=s1.nextDouble();
System.out.println(f);
float g=s1.nextFloat();
System.out.println(g);
boolean h=s1.nextBoolean();
System.out.println(h);

s1.close();

	}

}
