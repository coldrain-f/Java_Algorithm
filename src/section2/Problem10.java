package section2;

import java.util.Scanner;

//10. 봉우리 ( if문으로 상하좌우 직접 체크 )
public class Problem10 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
		각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
		격자의 가장자리는 0으로 초기화 되었다고 가정한다.
		만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다. */
		
		int n = sc.nextInt();
		int[][] board = new int[n + 2][n + 2];
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		//1행1열부터 5행5열까지 탐색을 시작한다.
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				int compare = 0;
				if (board[i][j] > board[i - 1][j]) {
					++compare;
				}
				
				if (board[i][j] > board[i + 1][j]) {
					++compare;
				}
				
				if (board[i][j] > board[i][j - 1]) {
					++compare;
				}
				
				if (board[i][j] > board[i][j + 1]) {
					++compare;
				}
				
				if (compare == 4) {
					++count;
				}
			}
		}
		
		System.out.println(count);

	}
}