package section2;

import java.util.Scanner;

//11. 임시반장 정하기 
public class Problem11 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int n = sc.nextInt();
		int[][] table = new int[n][5];
		
		//학생 정보 입력
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		
		int count = 0;
		int max = Integer.MIN_VALUE;
		int classLeader = -1;
		
		//0번 학생이 임시 반장이 될 수 있는지 체크한다.
		for (int i = 0; i < n; i++) {
		
			//1번 학생의
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				
				//모든 학년을 탐색해서 0번 학생과 한 번이라도 같은반이었던 적이 있는지 체크한다.
				for (int k = 0; k < 5; k++) {
					if (table[i][k] == table[j][k]) {
						++count;
						break;
					}
				}
			}
			
			//가장 많이 같은반이었다면 classLeader가 된다.
			if (count > max) {
				max = count;
				classLeader = i;
			}
			count = 0;
		}
		
		System.out.println(classLeader + 1);
	}
}
