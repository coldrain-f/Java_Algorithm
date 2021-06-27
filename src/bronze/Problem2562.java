package bronze;

import java.util.Scanner;

public class Problem2562 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;
		int findIndex = 0;
		for (int i = 1; i <= 9; i++) {
			int n = sc.nextInt();
			
			if (n > max) {
				max = n;
				findIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(findIndex);
	}
}
