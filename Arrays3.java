package Assignments;
import java.util.Arrays;
public class Arrays3 {
	
public static void main(String[] args) 
	{
		int [] number1=new int[4];
		number1[0]=4;
		number1[1]=7;
		number1[2]=3;
		number1[3]=6;
		System.out.print("First array is-->");
		System.out.println(Arrays.toString(number1));
		int [] number2=new int[number1.length];
		for(int i=0,j=number2.length-1;i<number2.length;i++,j--) {
			number2[j]=number1[i];
		}
		
		System.out.print("Second array is-->");
		System.out.println(Arrays.toString(number2));
		
	}

}
