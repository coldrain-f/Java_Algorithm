package section2;

import java.util.Scanner;

//5. 소수 (에라토스테네스의 체)
public class Problem05 {
	
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
		//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
		
		//1부터 n까지의 소수의 개수를 구하는 알고리즘은 에라토스테네스의 체가 가장 빠르다.
		
		int n = sc.nextInt();
		int[] primeCheck = new int[n + 1];
		int primeCount = 0;
		for (int i = 2; i <= n; i++) {
			//0이라면 소수다.
			if (primeCheck[i] == 0) {
				++primeCount;
				//i의 배수를 모두 1로 체크한다. 
				//i의 배수라는 말은 i를 약수로 가진다는 뜻이므로, 1과 자기 자신 이외에 약수를 가진다. 즉, 소수가 아니라는 말이다.
				for (int j = i; j <= n; j = j + i) {
					primeCheck[j] = 1;
				}
			}
		}
		
		System.out.println(primeCount);
	}
}
