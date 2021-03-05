import java.util.*;

public class primeNumber {
	public int solution(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];
		Arrays.fill(arr, 1);
		arr[0] = 0;
		arr[1] = 0;
		for (int i = 2; i < Math.sqrt(n) + 1; i++) {
			if (arr[i] == 1) {
				for (int j = i + i; j <= n; j += i)
					arr[j] = 0;
			}
		}
		for (int i = 0; i <= n; i++)
			if (arr[i] == 1)
				answer++;
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeNumber sol = new primeNumber();
		System.out.println(sol.solution(n));
	}
}
