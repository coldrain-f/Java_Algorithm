package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//2. 공통원소 구하기 ( 투 포인터 알고리즘 )
public class Problem02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arrayOne = new int[n];
		
		int p1 = 0;
		int p2 = 0;
		
		List<Integer> intersection = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			arrayOne[i] = sc.nextInt();
		}
		
		n = sc.nextInt();
		int[] arrayTwo = new int[n];
		
		for (int i = 0; i < n; i++) {
			arrayTwo[i] = sc.nextInt();
		}
		
		//투 포인터 알고리즘은 무조건 두 1차원 배열이 오름차순 정렬이 되어 있어야 한다.
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		
		
		
		while (p1 < arrayOne.length && p2 < arrayTwo.length) {
			//서로 같으면 공통 원소이다.
			if (arrayOne[p1] == arrayTwo[p2]) {
				intersection.add(arrayOne[p1]);
				++p1;
				++p2;
			} else { //공통원소가 아니면 작은쪽의 포인터를 증가시킨다.
				if (arrayOne[p1] < arrayTwo[p2]) {
					++p1;
				} else {
					++p2;
				}
			}
		}
		
		intersection.forEach(element -> System.out.print(element + " "));
	}
}
