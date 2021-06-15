package section2;

import java.util.Scanner;

public class Problem08 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int n = sc.nextInt();
		int[] ranks = new int[n];
		int[] scores = new int[n];
		
		//일단 처음엔 모두 1등이다.
		for (int i = 0; i < ranks.length; i++) {
			ranks[i] = 1;
		}
		
		for (int i = 0; i < n; i++) {
			int score = sc.nextInt();
			scores[i] = score;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (scores[j] > scores[i]) {
					++ranks[i];
				}
			}
		}
		
		for (int rank : ranks) {
			System.out.print(rank + " ");
		}
		
	}
}
