import java.util.Arrays;

public class sortString {
	public String solution(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}

//	public String solution(String s) {
//		String answer = "";
//		StringBuilder str = new StringBuilder(s);
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (str.charAt(i) < str.charAt(j)) {
//					char a = str.charAt(i);
//					char b = str.charAt(j);
//					str.setCharAt(i, b);
//					str.setCharAt(j, a);
//				}
//			}
//		}
//		answer = str.toString();
//		return answer;
//	}

	public static void main(String[] args) {
		sortString rs = new sortString();
		System.out.println(rs.solution("Zbcdefg"));
	}
}
