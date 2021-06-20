package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2. 공통원소 구하기 ( n^2 무식하게 풀기, 시간 초과 )
public class Problem02_3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		n = sc.nextInt();
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		
		//알고리즘 시작 ( n^2 )
		List<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersection.add(arr1[i]);
					break;
				}
			}
		}
		
		intersection.sort(null);
		intersection.forEach(element -> System.out.print(element + " "));
	}

}
