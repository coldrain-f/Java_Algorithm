package section3;

import java.util.Scanner;

//4. 연속 부분수열 ( Sliding Window 시간 초과...)
public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		int[] sequence = new int[N];
		for (int i = 0; i < N; i++) {
			sequence[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			
			int sum = 0; //sum 값을 미리 넣어놓는다.
			for (int j = 0; j < i + 1; j++) {
				sum += sequence[j];
			}
			if (sum == M) {
				++count;
			}
			
			//Sliding Window 
			for (int j = i + 1; j < N; j++) {
				sum -= sequence[j - (i + 1)];
				sum += sequence[j];
				if (sum == M) {
					++count;
				}
			}
		}
		
		
		System.out.println(count);
	}
}
