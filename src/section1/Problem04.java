package section1;

import java.util.Scanner;

public class Problem04 {

	//4. 단어 뒤집기 - 문자 배열로 풀기
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
		for(int i = 0; i < n; i++) {
			//입력을 받고
			words[i] = sc.next();
			
			//단어의 길이만큼 거꾸로 돌면서 문자 배열에 넣어준다.
			char[] reverse = new char[words[i].length()];
			int p = 0;
			for(int j = words[i].length() - 1; j >= 0; j--) {
				reverse[p++] = words[i].charAt(j); 
			}
			
			//리버스된 문자 배열을 문자열로 변환 후 정답에 넣는다.
			answer[i] = String.valueOf(reverse);
		}
		
		for(String result : answer) {
			System.out.println(result);
		}
		
	}

}
