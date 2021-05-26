package section1;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		//���ڿ� �Է�
		String str = sc.next();
		
		//������ ������ ���ڿ� ���� ����
		StringBuilder answer = new StringBuilder();
		
		for(char token : str.toCharArray()) {
			//���ڰ� �빮�ڶ��
			if(Character.isUpperCase(token)) {
				//�ҹ��ڷ� �����ϰ� ���信 ����ִ´�.
				token = Character.toLowerCase(token);
				answer.append(token);
			} else if(Character.isLowerCase(token)) { //�ҹ��ڶ��
				//�빮�ڷ� �����ϰ� ���信 ����ִ´�.
				token = Character.toUpperCase(token);
				answer.append(token);
			}
		}
		
		System.out.println(answer.toString());

	}

}
