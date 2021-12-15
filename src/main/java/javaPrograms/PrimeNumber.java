package javaPrograms;

public class PrimeNumber {

	// Check given number is prime or not
	public static void prime(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 1) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}

	// Print all primes numbers between 1 to n
	public static void printAllPrime(int n) {

		int j = 0;
		String PrimeNumbers = "";
		for (int i = 1; i <= n; i++) {
			int count = 0;

			for (j = i; j >= 1; j--) {

				if (i % j == 0) {
					count = count + 1;
				}
			}

			if (count == 2) {
				PrimeNumbers = PrimeNumbers + i + " ";
			}

		}

		System.out.println("Prime numbers from 1 to " + n + " are: ");
		System.out.println(PrimeNumbers);

	}

	public static void main(String[] args) {

//		prime(7);
		printAllPrime(150);

	}

}
