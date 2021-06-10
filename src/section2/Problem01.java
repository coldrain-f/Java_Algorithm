package section2;

import java.util.Scanner;

public class Problem01 {
	
	private static final Scanner sc = new Scanner(System.in);
	
	// 1. 큰 수 출력하기
	public static void main(String args[]) {
		//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요
		//(첫 번째 수는 무조건 출력한다.)
		
		//입력받을 개수
		final int n = sc.nextInt();
	
		//n개 만큼의 배열 준비
		int[] numbers = new int[n];
		
		//n개의 정수를 배열에 입력받는다.
		for(int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		//첫 번째 수는 무조건 출력한다.
		System.out.print(numbers[0] + " ");
		
		for(int i = 1; i < n; i++) {
			//현재 수가 앞에 있는 수보다 크다면 출력한다.
			if(numbers[i] > numbers[i - 1]) {
				System.out.print(numbers[i] + " ");
			}
		}
		
	}

}
