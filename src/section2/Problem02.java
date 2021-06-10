package section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem02 {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
		//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
		
		int n = sc.nextInt();
		List<Integer> heightList = new ArrayList<>();
		
		int tall = Integer.MIN_VALUE;
		int count = 0;
		
		//일단 순서대로 학생들의 키를 입력받는다.
		for (int i = 0; i < n; i++) {
			int height = sc.nextInt();
			heightList.add(height);
		}
	
		for (int i = 0; i < n; i++) {
			if(heightList.get(i) > tall) {
				++count;
				tall = heightList.get(i);
			}
		}
		
		System.out.println(count);
	}
	
}
