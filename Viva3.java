package Assignments;
public class Viva3 {
public static void main(String[] args) {
		 int[] num = {10,20,30,40,50};
		 	int minimum = num[0];
	        int maximum = num[0];
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] > maximum) {
	                maximum = num[i];
	            }
	            if (num[i] < minimum) {
	                minimum = num[i];
	            }
	        }

	        System.out.println("Maximum value: " + maximum);
	        System.out.println("Minimum value: " + minimum);
	}
}


