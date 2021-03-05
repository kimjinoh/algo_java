import java.util.*;
public class watermelon {
//	public String solution(int n) {
//		String answer = "";
//		String fruit = "수박";
//		for (int i = 0; i < n; i++) {
//			answer += fruit.charAt(i % 2);
//		}
//		return answer;
//	}
	public String solution(int n) {
		String answer = new String(new char[n/2+1]);
		answer = answer.replace("\0","수박").substring(0,n);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		watermelon sol = new watermelon();
		System.out.println(sol.solution(n));
	}

}
