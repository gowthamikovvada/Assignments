package Assignments;
class SCS2 {
	 public SCS2(int a)
	{
		System.out.println("Constructor can not be inherited");	
	}
}
public class SuperCallStatement extends SCS2{
	 public SuperCallStatement()
	 {
		 super(20);
			System.out.println("Constructor can not be inherited explicitly");	
		}
	
	static void login(){ 
		System.out.println("login to page");
	}

public static void main(String[] args) {
	new SuperCallStatement();
	login();
	

	}

}
