package section2;

import java.util.Scanner;

public class Problem05_3 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		int n = sc.nextInt();
		
		int[] primeCheck = new int[n + 1];
		
		int primeCount = 0; 
		for (int i = 2; i <= n; i++) {
			if (primeCheck[i] == 0) {
				++primeCount;
			
				for (int j = i; j <= n; j += i) {
					primeCheck[j] = 1;
				}
			}
		}
		
		System.out.println(primeCount);

	}

}
