package bronze;

import java.util.Scanner;

public class Problem10869 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int leftOp = sc.nextInt();
		int rightOp = sc.nextInt();
		
		System.out.println(leftOp + rightOp);
		System.out.println(leftOp - rightOp);
		System.out.println(leftOp * rightOp);
		System.out.println(leftOp / rightOp);
		System.out.println(leftOp % rightOp);
	}
}
