package bronze;

import java.util.Scanner;

public class Problem1330 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		int leftOp = sc.nextInt();
		int rightOp = sc.nextInt();
		
		if (leftOp > rightOp) System.out.println(">");
		else if (leftOp < rightOp) System.out.println("<");
		else System.out.println("==");
	}
}
