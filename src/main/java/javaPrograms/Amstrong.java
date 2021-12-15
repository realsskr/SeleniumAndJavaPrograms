package javaPrograms;

public class Amstrong {
	
	public static void main(String args[]) {
		int n=123, rev =0, a=0;
		int temp = n;
		
		while(n>0) {
			rev =n%10;
			a=a+(rev*rev*rev);
			n=n/10;
		}
		System.out.println("temp "+temp);
		System.out.println("a "+a);
		if(temp==a) {
			System.out.println("Amstrong");
		}
		else {
			System.out.println("Not Amstrong");
		}
	}

}
