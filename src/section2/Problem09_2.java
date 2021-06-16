package section2;

import java.util.Scanner;

//9. 격자판 최대합 ( 상수 아이디어 + 행의 합과 열의 합 병합 )
public class Problem09_2 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	private static final int ROW = 0;
	private static final int COLUMN = 1;
	private static final int LEFT_CROSS = 2;
	private static final int RIGHT_CROSS = 3;
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[][] board = new int[n][n];
		int[] total = new int[4];
		
		int max = Integer.MIN_VALUE;
		
		//격자판 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		//행의 합과 열의 합
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				total[ROW] += board[i][j];
				total[COLUMN] += board[j][i];
			}
			
			max = Math.max(max, total[ROW]);
			max = Math.max(max, total[COLUMN]);
			
			total[ROW] = total[COLUMN] = 0;
		}
		
		//왼쪽 대각선의 합
		for (int i = 0; i < n; i++) {
			total[LEFT_CROSS] += board[i][i];
		}
		max = Math.max(max, total[LEFT_CROSS]);
		
		
		//오른쪽 대각선의 합 
		for (int i = 0; i < n; i++) {
			total[RIGHT_CROSS] += board[i][(n - 1) - i];
		}
		max = Math.max(max, total[RIGHT_CROSS]);
		
		System.out.println(max);
	}
	
}
