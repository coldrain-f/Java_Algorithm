package section7;

//02. 재귀함수를 이용한 이진수 출력
public class Problem02 {
	
	private static void recursive(int decimal) {
		
		if (decimal == 0) {
			return;
		} else {
			recursive(decimal / 2);			
			System.out.print(decimal % 2 + " ");
		}
		
	}

	public static void main(String[] args) {
		//11을 입력하면 1011이 출력되게 재귀함수로 작성하시오.
		
		recursive(11);
	}

}
