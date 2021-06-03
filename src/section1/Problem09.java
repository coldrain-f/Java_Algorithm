package section1;

import java.util.Scanner;

public class Problem09 {

	//9. 숫자만 추출
	public static void main(String[] args) {
		//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
		//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
		//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
		
		final Scanner sc = new Scanner(System.in);
		final String str = sc.next();
		
		int result = 0;
		for(char token : str.toCharArray()) {
			if(Character.isDigit(token)) {
				int number = (int)token - 48;
				result = result * 10 + number;
			}
		}
		
		System.out.println(result);
		
	}
	
	private static void test() {
		char token = '0';
		
		System.out.printf("token의 아스키 코드값 = %d\n", (int)token);
		System.out.printf("token = %d\n", (int)token - 48);
		System.out.printf("token = %d\n", Integer.parseInt(String.valueOf(token)));
		
	}

}
