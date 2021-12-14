package javaPrograms;

public class ReverseNumber {
	
	//reverse number using while loop
	public static void reverseUsingWhile(int n) {
		int rev =0;
		System.out.println("Number before reverse: "+n);
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println("Number after reverse: "+rev);
	}
	
	
	//reverse number ending with zero
		public static void reverseNumEndingwithZero(long n) {
			System.out.println("Number before reverse: "+n);
			String s = String.valueOf(n);
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			System.out.println("Number before reverse: "+sb.toString());
		}
	
	public static void main(String... args) {
		
		reverseUsingWhile(87236);
		reverseNumEndingwithZero(35640L);
		
	}

}
