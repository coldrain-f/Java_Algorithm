package section1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
		
		//문자열 입력
		String str = sc.next();
		
		//정답을 저장할 문자열 빌더 선언
		StringBuilder answer = new StringBuilder();
		
		for(char token : str.toCharArray()) {
			//문자가 대문자라면
			if(Character.isUpperCase(token)) {
				//소문자로 변경하고 정답에 집어넣는다.
				token = Character.toLowerCase(token);
				answer.append(token);
			} else if(Character.isLowerCase(token)) { //소문자라면
				//대문자로 변경하고 정답에 집어넣는다.
				token = Character.toUpperCase(token);
				answer.append(token);
			}
		}
		
		System.out.println(answer.toString());

	}

}
