package section1;

import java.util.Scanner;

public class Problem04_2 {

	//4. 단어 뒤집기 - 스트링 빌더로 풀기
	public static void main(String[] args) {
		//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.	
		Scanner sc = new Scanner(System.in);
		
		//n을 입력받는다.
		int n = sc.nextInt();
		
		//n개 만큼의 단어의 배열을 만든다.
		String[] words = new String[n];
		
		//뒤집은 후 정답을 담을 배열
		String[] answer = new String[n];
		
		//n개 만큼의 단어를 단어 배열에 입력받는다.
		//reverse 메서드를 사용하기 위해 스프링 빌더를 정의한다.
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			//입력을 받고
			words[i] = sc.next();
			
			//스프링 빌더에 입력받은 단어를 집어넣고 reverse() 메서드로 뒤집어서 정답에 담는다.
			answer[i] = sb.append(words[i]).reverse().toString();
			//넣고나서 스프링 빌더 초기화
			sb.setLength(0);
		}
		
		for(String result : answer) {
			System.out.println(result);
		}
		
	}

}