package bronze;

import java.util.HashMap;
import java.util.Scanner;

public class Problem3052 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final HashMap<Integer, Integer> hashMap = new HashMap<>();
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			final int n = sc.nextInt();
			if (hashMap.getOrDefault(n % 42, 0) == 0) {
				++count;
				hashMap.put(n % 42, 1);
			}
		}
	
		System.out.println(count);
		sc.close();
	}

}
