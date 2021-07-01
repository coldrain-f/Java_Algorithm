package bronze;

import java.util.Scanner;

public class Problem2577 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int[] check = new int[10];
		
		int multi = 1;
		for (int i = 0; i < 3; i++) {
			multi *= sc.nextInt();
		}
		
		String numbers = String.valueOf(multi);
		
		for (char number : numbers.toCharArray()) {
			int index = (number - 48);
			++check[index];
		}
		
		for (int n : check) {
			System.out.println(n);
		}
		sc.close();
	}
}
