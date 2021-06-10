package kakao;

import java.util.ArrayList;
import java.util.List;

public class SecretMap {

	public static void main(String[] args) {
		test3();

	}
	
	private static void test2() {
		int decimal = 31;
		
		StringBuilder binary = new StringBuilder();
		while(decimal != 0) {
			binary.append(decimal % 2);
			decimal = decimal / 2;
		}
		
		System.out.println(binary.toString());
		
	}
	
	private static void test3() {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		
		List<String> map = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			String binary = new String();
			int decimal = arr1[i] | arr2[i];
			
			while(decimal != 0) {
				binary += decimal % 2;
				decimal = decimal / 2;
			}
			
			binary = binary.replace('1', '#').replace('0', ' ');
			StringBuilder reverse = new StringBuilder();
			binary = reverse.append(binary).reverse().toString();
			map.add(binary);
		}
		
		map.forEach(System.out::println);
	}
	
	
	
	
	private static void test() {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		
		List<String> map = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
			binary = binary.replace('1', '#').replace('0', ' ');
			map.add(binary);
		}
		
		map.forEach(System.out::println);
	}

}
