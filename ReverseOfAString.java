package Assignments;

public class ReverseOfAString {

	public static void main(String[] args) {
		String k="Level";
		String l=k.toLowerCase();
		System.out.println(l);
		String reverse="";
		
		for(int i=l.length()-1;i>=0;i--) {
			char s1=l.charAt(i);
			reverse=reverse+s1;
			}
		if(l.equals(reverse)) {
		System.out.print("It is a palindrome");
	}
		else {
			System.out.print("It is not a palindrome");
		}

}
}
