package javaPrograms;

public class Factorial {
	
	public static void main(String ... args) {
		
		int n=10,fact = 1;
		for(int i=n;i>0;i--) {
			fact = fact*i;
		}
		
		System.out.println("factorial of "+n+" is: "+fact);
		
	}

}
