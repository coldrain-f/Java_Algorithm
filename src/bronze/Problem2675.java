package bronze;

import java.util.Scanner;

public class Problem2675 {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		final int T = sc.nextInt();
		
		for (int i = 0; i < T; i++) {
			final int R = sc.nextInt();
			final String S = sc.next();
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
	}
}
