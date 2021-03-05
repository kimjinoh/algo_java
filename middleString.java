
public class middleString {
	public String solution(String s) {
        String answer = "";
        int index = s.length() / 2;
        if(s.length() % 2 == 0)
            answer = s.substring(index - 1, index + 1);
        else
            answer = s.substring(index, index + 1);
            //answer = Character.toString(s.charAt(index));
        return answer;
    }
	public static void main(String[] args) {
		String s = "qeqeqe";
		middleString sol = new middleString();
		System.out.println(sol.solution(s));

	}

}
