package section7;

//01. 재귀함수
public class Problem01 {
	
	//5 4 3 2 1출력
	public static void recursive1(int n) {
		
		if (n == 0) {
			return;
		} else {
			System.out.print(n + " ");
			recursive1(n - 1);			
		}
		
	}
	
	//1 2 3 4 5 출력
	public static void recursive2(int n) {
		
		if (n == 0) {
			return;
		} else {
			recursive2(n - 1);
			System.out.print(n + " ");
			
		}
	}
	
	public static void main(String[] args) {
		recursive1(5);
		System.out.println();
		recursive2(5);
	}
}
