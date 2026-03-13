package Assignments;

public class ThisCallingStatement {
	
	ThisCallingStatement(){
		System.out.println("This calling statement should be explicitly given");
	}
	ThisCallingStatement(int a,String b){
		this();
		System.out.println("This calling statement with parameters");
	}
	public static void main(String[] args) {
		
 new ThisCallingStatement(20,"Gowthami");
	}

}
