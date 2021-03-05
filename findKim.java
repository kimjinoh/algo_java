import java.util.Arrays;

public class findKim {
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
		findKim sol = new findKim();
		System.out.println(sol.solution(seoul));
	}

}
