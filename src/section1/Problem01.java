package section1;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�� ���� ���ڿ��� �Է¹޴´�.
		String str = sc.next().toUpperCase();
		
		//Ư�� ���� �ϳ��� �Է¹޴´�.
		char specificCharacter = sc.next().toUpperCase().charAt(0);
		
		//���ڿ��� Ư�� ���ڰ� �� �� �ִ��� ���� �˰����� �ۼ��Ͻÿ�.(��ҹ��� ����X)
		int count = 0;
		
		for(char token : str.toCharArray()) {
			if(token == specificCharacter) {
				++count;
			}
		}
		
		System.out.println(count);
	}

}
