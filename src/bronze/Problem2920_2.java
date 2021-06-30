package bronze;

import java.util.Scanner;

//음계
public class Problem2920_2 {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		if (isAscending(line)) System.out.println("오름차순");
		else if (isDescending(line)) System.out.println("내림차순");
		else System.out.println("둘 다 아님");
	}
	
	private static boolean isAscending(String line) {
		return line.equals("1 2 3 4 5 6 7 8") ? true : false; 
	}
	
	private static boolean isDescending(String line) {
		return line.equals("8 7 6 5 4 3 2 1") ? true : false; 
	}

}
