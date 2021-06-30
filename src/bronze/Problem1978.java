package bronze;

import java.util.Scanner;

public class Problem1978 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int primeCount = 0;
		for (int i = 0; i < n; i++) {
			int decimal = sc.nextInt();
			if(isPrime(decimal)) {
				++primeCount;
			}
		}
		
		System.out.println(primeCount);
		sc.close();
	}
	
	private static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
