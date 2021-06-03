package section1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem06 {

	//6. 중복문자 제거 (Set 자료구조 활용)
	public static void main(String[] args) {
		//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
		//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
		
		final Scanner sc = new Scanner(System.in);
		final String str =  sc.next();
		
		final Set<Character> hashSet = new LinkedHashSet<>();
		
		for(char token : str.toCharArray()) {
			hashSet.add(token);
		}
		
		hashSet.forEach(token -> System.out.print(token));
		
		
	}

}
