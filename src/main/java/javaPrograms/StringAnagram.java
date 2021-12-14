package javaPrograms;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String ... args) {
		
		String str1="Listen", str2="Silent";
		char[] c1=str1.toLowerCase().toCharArray();
		char[] c2=str2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		if(Arrays.equals(c1, c2)) {
			System.out.println("Given strings are Anagrams");
		}
		else {
			System.out.println("Given strings are not Anagrams");
		}
		
	}

}
