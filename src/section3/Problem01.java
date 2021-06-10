package section3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem01 {

	private static final Scanner sc = new Scanner(System.in);
	
	//1. 두 배열 합치기 (무식하게 풀기)
	public static void main(String[] args) {
		final int arr1_size = sc.nextInt();
		int[] arr1 = new int[arr1_size];
		
		//배열1 값 입력
		for(int i = 0; i < arr1_size; i++) {
			arr1[i] = sc.nextInt();
		}
		
		final int arr2_size = sc.nextInt();
		int[] arr2 = new int[arr2_size];
		
		//배열2 값 입력
		for(int i = 0; i < arr2_size; i++) {
			arr2[i] = sc.nextInt();
		}
		
		//배열1과 배열2 크기만큼의 새로운 배열3 생성
		int[] arr3 = new int[arr1_size + arr2_size];
		int p = 0;
		
		//배열3에 배열1을 모두 집어넣는다.
		for(int i = 0; i < arr1_size; i++) {
			arr3[p++] = arr1[i];
		}
		
		//배열3에 배열2를 모두 집어넣는다.
		for(int i = 0; i < arr2_size; i++) {
			arr3[p++] = arr2[i];
		}
		
		//정렬이 안 된 상태이므로 오름차순 정렬한다.
		Arrays.sort(arr3);
		
		//출력한다.
		Arrays.stream(arr3).forEach(n -> System.out.print(n + " "));
	}
	

}
