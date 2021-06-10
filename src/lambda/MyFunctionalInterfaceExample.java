package lambda;

public class MyFunctionalInterfaceExample {
	
	public static void main(String args[]) {
		
		Calculator calculator = (x, y) -> x + y;
		
		int result = calculator.calculate(10, 20);
		System.out.println(result);
		
		test1();
		
		test2();
		
	}
	
	private static void test2() {
		MyFunctionalInterface2 fi1 = (x) -> System.out.println(x);

		fi1.method(10);
	}

	//매개변수가 없는 함수적 인터페이스 테스트
	private static void test1() {
		
		// Example 1
		MyFunctionalInterface fi1 = () -> {
			String message = "method call1";
			System.out.println(message);
		};
		
		fi1.method();
		
		// Example 2
		MyFunctionalInterface fi2 = () -> { System.out.println("method call2"); };
		fi2.method();
		
		// Example 3
		MyFunctionalInterface fi3 = () -> System.out.println("method call3");
		fi3.method();
	}
	
}
