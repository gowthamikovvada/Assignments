package Assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String word1="listen";
		String word2="silent";
		char[] c1=word1.toCharArray();
		char[] c2=word2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		System.out.println("sorted array of c1 is-->"+ (Arrays.toString(c1)));
		Arrays.sort(c2);
		System.out.println("sorted array of c2 is-->"+ (Arrays.toString(c2)));
		if(Arrays.equals(c1,c2)) {
			System.out.println("The given words are anagram");
		}
		else {
			System.out.println("The given words are not anagram");	
		}
	}

}
