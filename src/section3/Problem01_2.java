package section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem01_2 {

	private static final Scanner sc = new Scanner(System.in);
	
	//1. 두 배열 합치기 (투 포인터 알고리즘)
	public static void main(String[] args) {
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		
		//투 포인터 알고리즘
		int p1 = 0;
		int p2 = 0;
		final List<Integer> arr3 = new ArrayList<>();
		
		while(p1 < arr1.length && p2 < arr2.length) {
			if(arr1[p1] < arr2[p2]) {
				arr3.add(arr1[p1++]);
			} else {
				arr3.add(arr2[p2++]);
			}
		}
		
		while(p1 < arr1.length) {
			arr3.add(arr1[p1++]);
		}
		
		while(p2 < arr2.length) {
			arr3.add(arr2[p2++]);
		}
		
		
		arr3.forEach(n -> System.out.print(n + " "));
	}

}
