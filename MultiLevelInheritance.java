package Assignments;
class MulInher{
	void mod(){
		System.out.println("modulas needs to be done here");
	}
}

public class MultiLevelInheritance extends ParentClass {
	
	static void mul() {
		System.out.println("Multiplication needs to be done here");
	}

	public static void main(String[] args) {
		
		ParentClass s1=new ParentClass();
		s1.addition();
		MulInher s2=new MulInher();
		s2.mod();
		mul();
	}

}
