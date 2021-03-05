import java.util.*;
public class stringToInt {
//	public int solution(String s) {
//		int answer = 0;
//		if (s.charAt(0) == '-' || s.charAt(0) == '+') {
//			answer = Integer.parseInt(s.substring(1, s.length()));
//			if (s.charAt(0) == '-')
//				answer *= -1;
//		} else
//			answer = Integer.parseInt(s.substring(0, s.length()));
//		return answer;
//	}
	public int solution(String s) {
		boolean flag = true;
		int answer = 0;
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == '-') 
				flag = false;
			else if(s.charAt(i) != '+')
				answer = answer * 10 + (s.charAt(i)-'0');
		}
		answer = (flag?1:-1) * answer;
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringToInt sol = new stringToInt();
		System.out.println(sol.solution(s));
	}

}
