package bronze;

import java.util.Scanner;

public class Problem11720 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final String numbers = sc.next();
		
		int sum = 0;
		for (char number : numbers.toCharArray()) {
			sum += ( number - 48 );
		}
		System.out.println(sum);
		sc.close();
	}
}
