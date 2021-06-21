package section3;

import java.util.Scanner;

//3. 최대 매출 ( 슬라이딩 윈도우 기법 )
public class Problem03_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < K; i++) {
			sum += arr[i];
		}
		
		int max = sum;
		
		for (int i = K; i <= N - K; i++) {
			sum = sum - arr[i - K];
			sum += arr[i];
			max = Math.max(max, sum);
		}
		
		System.out.println(max);
		sc.close();
	}
}
