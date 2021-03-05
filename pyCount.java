
public class pyCount {
	boolean solution(String s) {
		boolean answer = true;
		int cntp = 0;
		int cnty = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p')
				cntp++;
			else if (s.charAt(i) == 'y')
				cnty++;
		}
		if (cntp != cnty)
			answer = false;
		return answer;
	}

	public static void main(String[] args) {
		pyCount sol = new pyCount();
		System.out.println(sol.solution("pPyYyop"));
	}

}
