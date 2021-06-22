package check.problem;

public class Problem04 {

	public static void main(String[] args) {
		//Math.random()은 0.0 ~ 0.9 범위의 난수를 분포한다.
		
		while (true) {
			//1.0 ~ 1.9 -> 1 ~ 6
			int diceX = (int)(Math.random() * 6) + 1;
			int diceY = (int)(Math.random() * 6) + 1;
			
			if (diceX + diceY == 5) {
				System.out.print("(" + diceX + ", " + diceY + ")");
				System.out.println(" --> 성공");
				break;
			}
			
			System.out.print("(" + diceX + ", " + diceY + ")");
			System.out.println(" --> 실패");
		}
	}
}
