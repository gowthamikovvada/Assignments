package Assignments;
public class StringBufferProgram 
{
public static void main(String[] args) 
	{
		StringBuilder s1=new StringBuilder("Gowthami");
		System.out.println(s1.append(" Amruth"));
		System.out.println(s1.replace(0,8,"Riya"));
		System.out.println(s1.insert(5,"Lalith "));
		System.out.println(s1.delete(4,7));
		//System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,8));
		System.out.println(s1.reverse());
		System.out.println(s1.charAt(5));
		System.out.println(s1.length());
		s1.ensureCapacity(32);
		System.out.println(s1.capacity());
		
	}

}
