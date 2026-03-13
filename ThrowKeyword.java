package Assignments;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		if(1==1) 
		{
			throw new NullPointerException("due to fetching the data from an empty cell");
		}
		else 
		{
			throw new ArithmeticException("due to infinity");
		}
	}

}
