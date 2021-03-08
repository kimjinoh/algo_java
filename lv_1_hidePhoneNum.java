
public class lv_1_hidePhoneNum {
	public String solution(String phone_number) {
		char[] ch = phone_number.toCharArray();
		for (int i = 0; i < phone_number.length() - 4; i++)
			ch[i] = '*';
		String answer = String.valueOf(ch);
		return answer;
	}

	public static void main(String[] args) {
		String s = "01025458745";
		lv_1_hidePhoneNum sol = new lv_1_hidePhoneNum();
		System.out.println(sol.solution(s));
	}
}
