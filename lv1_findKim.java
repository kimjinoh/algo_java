import java.util.Arrays;

public class lv1_findKim {
	public String solution(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++)
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = { "Jane", "Kim" };
		lv1_findKim sol = new lv1_findKim();
		System.out.println(sol.solution(seoul));
	}

}
