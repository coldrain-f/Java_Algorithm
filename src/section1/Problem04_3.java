package section1;

import java.util.Scanner;

public class Problem04_3 {

	//4. 단어 뒤집기 - 투 포인터 알고리즘으로 풀기
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
			
			//투 포인터 알고리즘을 적용 시킨다.
			int lt = 0;
			int rt = (words[i].length() - 1);
			
			char[] word = words[i].toCharArray();
			while(lt <= rt) {
				char temp = word[lt];
				word[lt] = word[rt];
				word[rt] = temp;
				++lt;
				--rt;
			}
			
			answer[i] = String.valueOf(word);
		}
		
		for(String result : answer) {
			System.out.println(result);
		}
		
	}

}
