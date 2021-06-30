package bronze;

import java.util.Scanner;
import java.util.Stack;

public class Problem10828 {
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Stack<Integer> stack = new Stack<>();
		
		final int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			String command = sc.nextLine();
			
			if (command.startsWith("push ")) {
				String[] tokens = command.split(" ");
				int item = Integer.parseInt(tokens[1]);
				stack.push(item);
			} else if (command.equals("pop")) {
				System.out.println(stack.pop());
			} else if (command.equals("size")) {
				System.out.println(stack.size());
			} else if (command.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			} else if (command.equals("top")) {
				
			}
		}
	}
}
