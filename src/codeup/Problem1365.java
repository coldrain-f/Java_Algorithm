package codeup;

import java.util.Scanner;

public class Problem1365 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = sc.nextInt();
		char[][] board = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.printf("*");
				} else if(i == j){
					System.out.printf("*");
				} else {
					System.out.printf(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}
