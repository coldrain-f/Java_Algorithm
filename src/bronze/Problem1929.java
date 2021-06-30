package bronze;

import java.util.Scanner;

public class Problem1929 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int M = sc.nextInt();
		final int N = sc.nextInt();
		
		boolean[] sieve = new boolean[N + 1];
		
		for (int i = 2; i <= N; i++) {
			if (!sieve[i]) {
				if (i >= M) {
					System.out.println(i);					
				}
				for (int j = i; j <= N; j = j + i) {
					sieve[j] = true;
				}
			}
		}
		
		sc.close();
		//에라토스테네스의 체
	}
}
