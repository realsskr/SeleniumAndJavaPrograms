package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatefromArray {

	public static void main(String... args) {
		int arr[] = new int[] { '1', '1', '4', '4', '6', '4' };

		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					l.add(arr[j]);
				}
			}
		}
		System.out.println(l);
	}

}
