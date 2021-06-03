package section1;

import java.util.Scanner;

public class Problem10_2 {

	//12. 암호 (2진수 변환을 가중치 활용 -- 짜야 됨)
	public static void main(String[] args) {
		//test1();
		
		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		
		String result = "";
		String str = sc.next();
		double weight = 6.0;
		for(int i = 0; i < n; i++) {
			String cipher = str.substring(0, 7);
			String binary = cipher.replace('#', '1').replace('*', '0');
			
			//binary를 10진수로 변환하는 로직 작성
			//1100001
			Math.pow(2, weight);
			
			
			//char token = (char)decimal;
			
			//result += token;
			str = str.substring(7);
		}
		
		System.out.println(result);
	}
	
	private static void test1() {
		String str = "#****###**#####**#####**##**";
		
		for(int i = 0; i < 4; i++) {
			//0번 index부터 6번 index까지 7개의 문자를 짜른다.
			String cipher = str.substring(0, 7);
			System.out.println("cipher = " + cipher);
			
			//7번째부터 마지막 까지를 잘라서 집어넣는다.
			str = str.substring(7);
		}
	}
	
	private static void test2() {
		String str = "#*****#";
		
		//#은 1로 치환한다.
		str = str.replace('#', '1');
		System.out.println("str = " + str);
		
		//*은 0으로 치환한다.
		str = str.replace('*', '0');
		System.out.println("str = " + str);
		
		str = "#*****#";
		//아래와 같이 한 줄로 적어줘도 된다.
		String binary = str.replace('#', '1').replace('*', '0');
		System.out.println("binary = " + binary);
		
		
		//2진수를 10진수로 변환하기
		//Integer.parseInt() 메서드에 2진수 문자열과 두 번째 매개변수로 2를 넘겨주면 2진수를 10진수로 변환해준다.
		int decimal = Integer.parseInt(binary, 2);
		System.out.println("decimal = " + decimal);
		
		//변환한 10진수를 문자로 변환하기
		char token = (char)decimal;
		System.out.println("token = " + token);
	}

}