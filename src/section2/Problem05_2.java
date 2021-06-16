package section2;

import java.util.Scanner;

//5. 소수 (에라토스테네스의 체) 시간 초과
public class Problem05_2 {
	
	private static final Scanner sc = new Scanner(System.in);
	
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
	
	public static void main(String args[]) {
		int n = sc.nextInt();
		
		int primeCount = 0;
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				++primeCount;
			}
		}
		
		System.out.println(primeCount);
	}

}
