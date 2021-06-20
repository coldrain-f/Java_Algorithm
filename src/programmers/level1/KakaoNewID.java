package programmers.level1;

public class KakaoNewID {

	public static void main(String[] args) {
		test1();
		
	}
	
	private static void test1() {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		StringBuilder sb = new StringBuilder();
		
		//1단계
		for (char token : new_id.toCharArray()) {
			if (Character.isUpperCase(token)) {
				sb.append(Character.toLowerCase(token));
			} else {
				sb.append(token);
			}
		}
		
		new_id = sb.toString();
		sb.setLength(0);
		
		//2단계
		for (char token : new_id.toCharArray()) {
			if (Character.isLowerCase(token) || Character.isDigit(token)
					|| token == '-' || token == '_' || token == '.') {
				sb.append(token);
			}
		}
		
		new_id = sb.toString();
		sb.setLength(0);
		
		//3단계
		

		
	}
	
}
