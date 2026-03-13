package Assignments;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
public class Exceptions 
{
public static void main(String[] args) throws MalformedURLException, InterruptedException, FileNotFoundException 
	{
	URL u1=new URL("https://www.google.com");
	System.out.println("valid link");
	for (int i=0;i<=10;i++) 
	{
	Thread.sleep(1000);
	System.out.println(i);
	
	}
	//FileInputStream f1=new FileInputStream("C:\Users\prabh\OneDrive\Pictures\Screenshots\Screenshot 2025-12-16 133540.png");
		//	System.out.println("valid path");
	}
}
