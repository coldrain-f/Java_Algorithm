package bronze;

import java.util.Scanner;

//단어의 개수 (해결)
public class Problem1152 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		sentence = sentence.trim();
		int result = 0;
		String[] words = sentence.split(" ");
		
		if(!sentence.isEmpty()) {
			result = words.length;
		}
		
		System.out.println(result);
	}
}
