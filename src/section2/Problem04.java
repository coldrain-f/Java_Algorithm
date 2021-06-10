package section2;

import java.util.Scanner;

public class Problem04 {
	
	private static final Scanner sc = new Scanner(System.in);

	//4. 피보나치 수열
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		
		int first = 0;
		int second = 1;
		
		System.out.print(second + " ");
		for(int i = 1; i < n; i++) {
			int now = first + second;
			System.out.print(now + " ");
			first = second;
			second = now;
		}
	}

}
