package Assignments;
public class StringFunctions {
public static void main(String[] args) {
		String a="Gowthami";
		String b="Amruth";
		String c= "    D no 642  Rajahmundry   ";
		boolean result=	a.equals(b);
		System.out.println(result);
		int g=a.length();
		System.out.println(g);
		System.out.println(b.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.concat(" ").concat("Riyanshika"));
		System.out.println(c.trim());
		System.out.println(a.equalsIgnoreCase(b));
		boolean answer=a.contains("th");
		System.out.println(answer);
		String l=b.substring(3);
		System.out.println(l);
		System.out.println(a.substring(2,5));
		System.out.println (b.matches("A(.*)") || a.matches("(.*)i"));
		System.out.println(a.replace('G', 'g'));
		String k=b.replace("Amruth","Riya");
		System.out.println(k);
		System.out.println(a.replaceAll("[A-Z]","MOM"));//REplace all the capital letters to MOM
		char w= b.charAt(1);
		System.out.println(w);
		System.out.println(a.indexOf('t'));
		
		
}
}
