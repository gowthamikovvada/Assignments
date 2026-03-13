package Assignments;
import java.util.Arrays;
public class StringFunctions2 {
	static int countOfAlphabets=0;
	static int countOfNumerics=0;
	public static void main(String[] args) {
		String s="kv no 2";
		char []c=s.toCharArray();
		//int number[]=new int[c.length];
		for (int i=0;i<c.length;i++) {
		boolean b1=Character.isAlphabetic(c[i]);
		if(b1) 
		{
			System.out.println("at index"+i+" -->is an alphabet");
			countOfAlphabets++;
		}
		boolean b2=Character.isDigit(c[i]);
		if(b2) {
			System.out.println("at index"+i+" -->is a digit");
			countOfNumerics++;
		}
	}
		System.out.println("Number of alphabets-->"+countOfAlphabets);
		System.out.println("Number of Digits-->"+countOfNumerics);

}
}
