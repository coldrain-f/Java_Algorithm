package section5;

import java.util.Scanner;
import java.util.Stack;


public class Problem4 {
	
	//4. 후위식 연산(postfix)
	public static void main(String[] args) {
		/**
		 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
		 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
		 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
		 */
		
		//352+*9-
		Scanner sc = new Scanner(System.in);
		
		//후위연산식을 하나 입력받는다.
		String postfix = sc.next();
		
		Stack<Integer> stack = new Stack<>();
		
		int result = 0;
		for(char token : postfix.toCharArray()) {
			//토큰이 숫자라면
			if(Character.isDigit(token)) {
				//스택에 push 한다.
				int item = (int)token - 48;
				stack.push(item);
			} else { //토큰이 숫자가 아니라면
				int rightOperand = stack.pop();
				int leftOperand = stack.pop();
			
				//계산해서 결과에 누적한다.
				switch(token) {
					case '+':
						result = leftOperand + rightOperand;
						break;
					case '-':
						result = leftOperand - rightOperand;
						break;
					case '*':
						result = leftOperand * rightOperand;
						break;
					case '/':
						result = leftOperand / rightOperand;
						break;
				}
				
				stack.push(result);
			}
		}
		
		System.out.println(result);
		
	}

}
