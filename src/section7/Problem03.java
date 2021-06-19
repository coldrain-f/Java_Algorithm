package section7;

//03. 팩토리얼 재귀로 구현
public class Problem03 {
	
	private static int factorial(int n) {
		
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
