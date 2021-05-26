package section1;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		/**
		 * �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
		 * ������� �� �ܾ�� �������� ���е˴ϴ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		//�� ���� ������ �־�����
		String sentence = sc.nextLine();
		
		//���� �� �ܾ ����ϴ� ���� �ۼ�
		//������ ���� ���ڷ� �ΰ� �ڸ���.
		String[] tokens = sentence.split(" ");
		
		//���� �� ���ڿ��� ���̸� ��� ����
		int length = Integer.MIN_VALUE;
		
		for(String token : tokens) {
			//������ �ִ� ���ڿ��� ���̺��� ���� ���ڿ��� ���̰� �� ��ٸ�
			if(token.length() > length) {
				//���� �� ���ڿ��� ���̸� ���� ���ڿ��� ���̷� �����Ѵ�.
				length = token.length();
				//�׸��� ���� �������� ���� �� ���ڿ��̹Ƿ� ���信 ��´�.
				answer = token;
			}
		}
		
		System.out.println(answer);
	}

}
