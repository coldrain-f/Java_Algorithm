package section1;

import java.util.Scanner;

public class Problem06_2 {

	//6. 중복문자 제거 (indexOf() 활용)
	public static void main(String[] args) {
		//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
		
		//test();
		
		final Scanner sc = new Scanner(System.in);
		final String str = sc.next();
		final StringBuilder answer = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char token = str.charAt(i);
			int tokenPosition = i;
			if(tokenPosition == str.indexOf(token)) {
				answer.append(token);
			}
		}
		
		System.out.println(answer.toString());
	}
	
	private static void test() {
		String str = "ksekkset";
		
		for(int i = 0; i < str.length(); i++) {
			char token = str.charAt(i);
			
			//token이 현재 있는 위치랑 token이 처음발견되는 위치가 같지 않으면 중복이다.
			//왜냐하면 같지 않다는 말은 그 앞에 중복되는 token이 이미 발견되었다는 의미이기 떄문이다.
			System.out.printf("%c %d %d\n", token, i, str.indexOf(token));
		}
		
	}

}
