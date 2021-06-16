package section2;

import java.util.Scanner;

//9. 격자판 최대합 ( 각 행의 합, 각 열의 합, 각 대각선의 합을 각각 분리해서 해결 )
public class Problem09 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		int max = Integer.MIN_VALUE;
		
		//격자판 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		//각 행의 합 중 가장 큰 값을 찾는다.
		for (int i = 0; i < n; i++) {
			int rowTotal = 0;
			for (int j = 0; j < n; j++) {
				rowTotal += board[i][j];
			}
			
			if (rowTotal > max) {
				max = rowTotal;
			}
		}
		
		//각 열의 합 중 가장 큰 값을 찾는다.
		for (int i = 0; i < n; i++) {
			int colTotal = 0;
			for (int j = 0; j < n; j++) {
				colTotal += board[j][i];
			}
			
			if (colTotal > max) {
				max = colTotal;
			}
		}
		
		//왼쪽에서 출발하는 대각선의 합 중 가장 큰 값을 찾는다.
		int leftCrossTotal = 0;		
		for (int i = 0; i < n; i++) {
			leftCrossTotal += board[i][i];
		}
		if (leftCrossTotal > max) {
			max = leftCrossTotal;
		}
		
		//오른쪽에서 출발하는 대각선의 합 중 가장 큰 값을 찾는다.
		int rightCrossTotal = 0;
		for (int i = 0; i < n; i++) {
			rightCrossTotal += board[i][(n - 1) - i];
		}
		if (rightCrossTotal > max) {
			max = rightCrossTotal;
		}
		
		System.out.println(max);
		
	}
}
