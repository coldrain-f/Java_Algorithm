package bronze;

import java.util.Scanner;

public class Problem2908 {

	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] numbers = line.split(" ");
		
		StringBuilder sb = new StringBuilder();
		int max = Integer.MIN_VALUE;
		for (String number : numbers) {
			int n = Integer.parseInt(sb.append(number).reverse().toString());
			max = Math.max(max, n);
			sb.setLength(0);
		}
		
		System.out.println(max);
		sc.close();
	}
}
