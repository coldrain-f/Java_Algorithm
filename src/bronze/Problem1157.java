package bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//단어 공부
public class Problem1157 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Map<Character, Integer> hashMap = new HashMap<>();
		
		String tokens = sc.next().toUpperCase();
		for (char token : tokens.toCharArray()) {
			hashMap.put(token, hashMap.getOrDefault(token, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		char findCh = tokens.charAt(0);
		for (char key : hashMap.keySet()) {
			int value = hashMap.get(key);
			if (value > max) {
				max = value;
				findCh = key;
			}
		}
		
		int duplicate = 0;
		for (char key : hashMap.keySet()) {
			int value = hashMap.get(key);
			if (max == value) {
				++duplicate;
			}
		}
		if (duplicate >= 2) {
			findCh = '?';
		}
		
		System.out.println(findCh);
		sc.close();
	}
}
