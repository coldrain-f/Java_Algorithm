package check.problem;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("예금액> ");
				balance += sc.nextInt();
			} else if (select == 2) {
				System.out.print("출금액> ");
				balance -= sc.nextInt();
			} else if (select == 3) {
				System.out.print("잔고> " + balance);
			} else if (select == 4) {
				break; 
			} else {
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			
			System.out.println();
		}
		
		System.out.println("\n프로그램 종료");
	}
}
