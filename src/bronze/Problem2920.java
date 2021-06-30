package bronze;

import java.util.Scanner;

//음계
public class Problem2920 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		// 30  22 
		
		final int[] numbers = new int[8];
		for (int i = 0; i < 8; i++) {
			numbers[i] = sc.nextInt();
		}
		
		if (isAscending(numbers)) {
			System.out.println("ascending");
		} else if (isDescending(numbers)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
	
	private static boolean isAscending(int[] numbers) {
		int check = 1;
		for (int number : numbers) {
			if (number != check) {
				return false;
			}
			++check;
		}
		
		return true;
	}
	
	private static boolean isDescending(int[] numbers) {
		int check = 8;
		for (int number : numbers) {
			if (number != check) {
				return false;
			}
			--check;
		}
		
		return true;
	}
		
}
