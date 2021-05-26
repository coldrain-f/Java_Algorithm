package section1;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//한 개의 문자열을 입력받는다.
		String str = sc.next().toUpperCase();
		
		//특정 문자 하나를 입력받는다.
		char specificCharacter = sc.next().toUpperCase().charAt(0);
		
		//문자열에 특정 문자가 몇 개 있는지 세는 알고리즘을 작성하시오.(대소문자 구분X)
		int count = 0;
		
		for(char token : str.toCharArray()) {
			if(token == specificCharacter) {
				++count;
			}
		}
		
		System.out.println(count);
	}

}
