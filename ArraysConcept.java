package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysConcept {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enterb size of an array");
		int rollno[]=new int[s1.nextInt()];
		for(int i=0;i<rollno.length;i++) {
			System.out.println("Enter the value at index" +i);	
	rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		
		String name[]=new String[3];
		name[0]="Gowthami";
		name[1]="Amruth";
		name[2]="Riya";
		name[0]="Lalith";
		
		System.out.println(Arrays.toString(name));
		
		/*char C1[]=new char[4];
		C1[0]='A';
		C1[1]='B';
		C1[2]='C';
		C1[3]='D';
		System.out.println(Arrays.toString(C1));
		
		boolean answer[]=new boolean[2];
		answer[0]=true;
		answer[1]=false;
		System.out.println(Arrays.toString(answer));
		
		double value[]=new double[3];
		value[0]=45.6;
		value[1]=25.7;
		value[2]=34.4;
		System.out.println(Arrays.toString(value));*/
		
	}

}
