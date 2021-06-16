package section2;

import java.util.Scanner;

//10. 봉우리 ( 배열로 상하좌우 체크 )
public class Problem10_2 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[][] board = new int[n + 2][n + 2];
		int count = 0;
		
		int[] dy = { -1, +1, 0, 0 };
		int[] dx = { 0, 0, -1, +1 };
		
		//격자판 입력
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		//격자판 탐색 시작
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				//상하좌우 체크
				int check = 0;
				for (int k = 0; k < 4; k++) {
					if ( board[i][j] > board[i + dy[k]][j + dx[k]] ) {
						++check;
					}
				}
				
				//check 값이 4라면 봉우리다.
				if (check == 4) {
					++count;
				}
			}
		}
		
		System.out.println(count);
	}
}
