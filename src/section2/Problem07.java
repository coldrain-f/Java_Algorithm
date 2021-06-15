package section2;

import java.util.Scanner;

//7. 점수계산
public class Problem07 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int n = sc.nextInt();
		
		int bonus = 0;
		int score = 0;
		for (int i = 0; i < n; i++) {
			int item = sc.nextInt();
			if (item == 1) {
				++bonus;
				score += bonus;
			} else if (item == 0) {
				bonus = 0;
			}
		}
		
		System.out.println(score);
	}

}
