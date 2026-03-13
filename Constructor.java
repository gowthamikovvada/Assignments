package mathmethod;

public class Constructor {
   public Constructor(){
	   int a=10;
	   int b=20;
	   int c=a+b;
	System.out.println(c);
}
   private Constructor(int a,int b) {
	   
	   System.out.println("It is a constructor program2");
   }
   protected Constructor(int a,double b) {
	   double c= a+b;
	   System.out.println(c);
	   System.out.println("It is a constructor program3");
   }
    Constructor(double a,double b) {
	   System.out.println("It is a constructor program4");
   }
	public static void main(String[] args) {
		
 Constructor a1=new Constructor();
 //new Constructor();//Another way of object creation
 Constructor b1=new Constructor(20,30);
 
 new Constructor(30,60.8);
 
 new Constructor(30.8,60.8);
	}

}
