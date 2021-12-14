package javaPrograms;

public class ReverseString {

	// Using Loop
	public static String usingLoop(String str) {
		String temp = "";
		System.out.println("Before reverse usingLoop: " + str);
		int size = str.length();
		for (int i = size - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		System.out.println("After Reverse usingLoop: " + temp);
		return temp;
	}

	// Using String Buffer
	public static String usingStringBuffer(String str) {
		System.out.println("Before Reverse usingStringBuffer: " + str);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("After Reverse usingStringBuffer: " + sb.toString());
		return sb.toString();
	}

	// Using String Builder
	public static String usingStringBuilder(String str) {
		System.out.println("Before Reverse usingStringBuilder: " + str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println("After Reverse usingStringBuilder: " + sb.toString());
		return sb.toString();
	}

	// Convert String to Character array and then using loop we can get and print
	// each char using index
	public static void usingCharArray(String str) {
		System.out.println("Before Reverse usingCharArray: " + str);
		char[] c = str.toCharArray();
		System.out.println("After Reverse usingCharArray: ");
		for (int i = c.length - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}

	}

	public static void main(String... args) {

		usingLoop("Welcome");
		usingStringBuffer("Testing");
		usingStringBuilder("Selenium");
		usingCharArray("Program");

	}

}
