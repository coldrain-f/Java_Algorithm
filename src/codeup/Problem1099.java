package codeup;

import java.util.Scanner;

public class Problem1099 {

	private static final Scanner sc = new Scanner(System.in);
	private static final int WALL = 1;
	
	private static final int ROW = 10;
	private static final int COLUMN = 10;
	
	
	public static void main(String[] args) {
		int[][] map = new int[ROW][COLUMN];
		
		//입력문
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COLUMN; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		//개미 알고리즘
		int x_position = 1;
		int y_position = 1;
		
		while(map[y_position][x_position] != 2) {
			
			//개미의 현재 위치를 9로 체크한다.
			map[y_position][x_position] = 9;
			
			//개미의 현재 위치에서 오른쪽이 벽인가?
			if(map[y_position][x_position + 1] == WALL) {
				if(map[y_position - 1][x_position] == WALL) {
					++y_position;
				}
			} else { //개미의 현재 위치에서 오른쪽이 벽이 아니라면?
				++x_position;
			}
		}
		map[y_position][x_position] = 9;
		
		//출력문
		for(int i = 0; i < ROW; i++) {
			for(int j = 0; j < COLUMN; j++) {
				System.out.printf("%d ", map[i][j]);
			}
			System.out.println();
		}
		
	}

}
