package section1;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		/**
		 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
		 * 문장속의 각 단어는 공백으로 구분됩니다.
		 */

		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		//한 개의 문장이 주어지면
		String sentence = sc.nextLine();
		
		//가장 긴 단어를 출력하는 로직 작성
		//공백을 구분 문자로 두고 자른다.
		String[] tokens = sentence.split(" ");
		
		//가장 긴 문자열의 길이를 담는 변수
		int length = Integer.MIN_VALUE;
		
		for(String token : tokens) {
			//기존에 있던 문자열의 길이보다 현재 문자열의 길이가 더 길다면
			if(token.length() > length) {
				//가장 긴 문자열의 길이를 현재 문자열의 길이로 변경한다.
				length = token.length();
				//그리고 현재 시점에서 가장 긴 문자열이므로 정답에 담는다.
				answer = token;
			}
		}
		
		System.out.println(answer);
	}

}
