package Assignments;
import java.util.Arrays;
public class CountOfAlpha {
	static int CountOfAlphabets=0;
	static int CountOfSpace=0;
	static int CountOfSpecial=0;
	static int CountOfDigits=0;
	public static void main(String[] args) {
		String address="D no.6-302";
		char [] c1=address.toCharArray();
		for (int i=0;i<c1.length;i++) 
		{
		boolean a=Character.isAlphabetic(c1[i]);
  if(a) {
	  CountOfAlphabets++;
  }
  boolean b=Character.isDigit(c1[i]);
  if(b) {
	  CountOfDigits++;
  }
  boolean c=Character.isWhitespace(c1[i]);
  if(c) {
	  CountOfSpace++;
  }
  CountOfSpecial=(c1.length)-(CountOfAlphabets+CountOfDigits+CountOfSpace);
	}
System.out.println("The count of Alphabets-->"+CountOfAlphabets);
System.out.println("The count of Digits-->"+CountOfDigits);
System.out.println("The count of WhiteSpaces-->"+CountOfSpace);
System.out.println("The count of Special-->"+CountOfSpecial);
}
}
