package section3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//2. 공통원소 구하기 ( TreeSet 사용하기 )
public class Problem02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Set<Integer> set1 = new TreeSet<>();
		Set<Integer> set2 = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			set1.add(element);
		}
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int element = sc.nextInt();
			set2.add(element);
		}
		
		//교집합 메서드
		set1.retainAll(set2);

		
		//TreeSet 자료구조는 자동으로 오름차순으로 정렬한다.
		for (int element : set1) {
			System.out.print(element + " ");
		}
		
	}
}
