package section2;

import java.util.Scanner;

//12. 멘토링
public class Problem12 {
	
	private static final Scanner sc = new Scanner(System.in);	
	
	private static final int MENTO = 0;
	private static final int MENTI = 1;
	
	public static void main(String[] args) {
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		final int[][] board = new int[M + 1][N + 1];
		
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= N; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		
		for (int mento = 1; mento <= N; mento++) {
			for (int menti = 1; menti <= N; menti++) {
				if (mento == menti) {
					continue;
				}
				boolean flag = false;
				for (int i = 1; i <= M; i++) {
					int rank[] = new int[2];
					for (int j = 1; j <= N; j++) {
						if (mento == board[i][j]) {
							rank[MENTO] = j;
						} else if (menti == board[i][j]) {
							rank[MENTI] = j;
						}
					}
					if (rank[MENTO] < rank[MENTI]) {
						flag = true; //false true true
					} else {
						flag = false; 
						break;
					}
				}
				
				if (flag) {
					++count;
				}
			}
		}
		
		System.out.println(count);
		
	}
	

	private static void test() {
		int[] board = { 0, 3, 4, 1, 2 };
		
		int mento = 1;
		int menti = 2;
		
		int count = 0;
		
		int[] rank = new int[2];
		for (int i = 1; i <= 4; i++) {
			if (mento == board[i]) {
				rank[MENTO] = i;
			} else if (menti == board[i]) {
				rank[MENTI] = i;
			}
		}
		
		if (rank[MENTO] < rank[MENTI]) {
			System.out.println("rank[MENTO] = " + rank[MENTO]);
			System.out.println("rank[MENTI] = " + rank[MENTI]);
			++count;
		}
		
		System.out.println(count);
	}

}
