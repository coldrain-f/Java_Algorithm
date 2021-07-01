package bronze;

import java.util.Scanner;

public class Problem10809 {

	public static void main(String[] args) {
	
		final Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (char alpha = 'a'; alpha <= 'z'; alpha++) {
			boolean flag = false;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == alpha) {
					System.out.print(i + " ");
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.print("-1 ");				
			}
		}
		
		sc.close();
	}

}
