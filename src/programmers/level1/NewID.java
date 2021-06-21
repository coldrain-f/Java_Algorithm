package programmers.level1;

public class NewID {
	
	public static void main(String[] args) {
		solution();
	}

	private static void solution() {
		String new_id = "123_.def";
		new_id = level01(new_id);
		new_id = level02(new_id);
		new_id = level03(new_id);
		new_id = level04(new_id);
		new_id = level05(new_id);
		new_id = level06(new_id);
		new_id = level07(new_id);
	}
	
	//길이가 2 이하라면 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에다 붙인다.
	private static String level07(String new_id) {
		String converted_id = null;
		
		while (new_id.length() <= 2) {
			new_id += new_id.charAt(new_id.length() - 1);
		}
		
		converted_id = new_id;
		System.out.println(converted_id);
		return converted_id;
	}
	
	//길이가 16자 이상이면 첫 15개를 제외한 나머지 문자를 제거한다.
	private static String level06(String new_id) {
		String converted_id = null;
		if (new_id.length() >= 16) {
			converted_id = new_id.substring(0, 15);
			//제거 후 마침표가 끝에 위치한다면 끝의 마침표를 제거한다.
			if (converted_id.charAt(converted_id.length() - 1) == '.') {
				converted_id = converted_id.substring(0, converted_id.length() - 1);
			}
		} else {
			converted_id = new_id;
		}
		
		System.out.println(converted_id);
		return converted_id;
	}
	
	//빈 문자열이라면 a를 대입한다.
	private static String level05(String new_id) {
		String converted_id = null;
		if (new_id.isEmpty()) {
			converted_id = "a";
		} else {
			converted_id = new_id;
		}
		
		System.out.println(converted_id);
		return converted_id;
	}

	//아이디의 처음과 끝에 위치한  마침표를 제거한다.
	private static String level04(String new_id) {
		String converted_id = null;
		
		if (new_id.equals("")) {
			return new_id;
		}
		
		if (new_id.charAt(0) == '.') {
			new_id = new_id.substring(1);
		}
		
		if (new_id.charAt(new_id.length() - 1) == '.') {
			new_id = new_id.substring(0, new_id.length() - 1);
		}
		
		converted_id = new_id;
		
		System.out.println(converted_id);
		return converted_id;
	}
	
	//마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환한다.
	private static String level03(String new_id) {
		String converted_id = "";
		// ...bat..y.abcdefghijklm
		
		int dotCount = 0;
		for (int i = 0; i < new_id.length(); i++) {
			if (new_id.charAt(i) == '.') {
				++dotCount;
			} else { // 마침표가 아니고
				// dotCount가 2 이상이라면 converted_id에 '.'을 추가한다.
				if (dotCount >= 1) {
					converted_id += '.';
					dotCount = 0;
				}
				converted_id += new_id.charAt(i);
			}
		}
		
		System.out.println(converted_id);
		return converted_id;
	}
	
	//알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자를 제거한다.
	private static String level02(String new_id) {
		String converted_id = "";
		
		for (char token : new_id.toCharArray()) {
			if (Character.isLowerCase(token) || token == '-' 
					|| token == '_' || token == '.' || Character.isDigit(token)) {
				converted_id += token;
			}
		}
		
		System.out.println(converted_id);
		return converted_id;
	}
	
	//대문자를 소문자로 치환한다.
	private static String level01(String new_id) {
		String converted_id = "";
		
		for (char token : new_id.toCharArray()) {
			if (Character.isUpperCase(token)) {
				converted_id += Character.toLowerCase(token);
			} else {
				converted_id += token;
			}
		}
		
		System.out.println(converted_id);
		return converted_id;
	}
}
