package Assignments;
/*class Scs2{
	Scs2(int a){
		System.out.println(a);
		System.out.println("Explicit Super calling statement is not required");
	}
}*/
public class ScsTcsinSingleClass{
	
	ScsTcsinSingleClass(){

		System.out.println("This is the parent class constructor");
	}
	ScsTcsinSingleClass(int a, String b){
		this();
				System.out.println("Will call the parent class constructor");
			}

	public static void main(String[] args) {
		
		new ScsTcsinSingleClass(20, "Ram");
	}

}
