package section3;

import java.util.Scanner;

//3. 최대 매출 ( 2중 반복문 시간 초과 )
public class Problem03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= N - K; i++) {
		
			int sum = 0;
			for (int j = i; j <= i + K - 1; j++) {
				sum += arr[j];
			}

			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		sc.close();
	}
}
