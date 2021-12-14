package javaPrograms;

public class FibonacciSeries {
	
	public static void main(String ... args) {
		
		int a=0,b=1,temp=0,n=10;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=0;i<n;i++) {
			temp =a+b;
			System.out.print(temp+" ");
			a=b;
			b=temp;
		}
		
	}	

}
