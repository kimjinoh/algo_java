import java.util.*;
public class sumOfDigit {
	public int solution(int n) {
		int answer = 0;
		while (n > 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sumOfDigit sol = new sumOfDigit();
		System.out.println(sol.solution(n));
	}

}
