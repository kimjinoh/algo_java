
public class collatz {
	public int solution(int num) {
		int answer = 0;
		long NUM = num;
		while (NUM != 1) {
			NUM = (NUM % 2 == 0)?NUM / 2:NUM * 3 + 1;
			answer++;
			if(answer == 500)
				return -1;
		}
		return answer;
	}
	public static void main(String[] args) {
		int n = 1234533;
		collatz sol = new collatz();
		System.out.println(sol.solution(n));
	}
}
