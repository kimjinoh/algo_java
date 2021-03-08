
public class lv1_xTonx {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1 ; i < n; i++)
            answer[i] = answer[i-1] + x;
        return answer;
    }
	public static void main(String[] args) {
		lv1_xTonx sol = new lv1_xTonx();
		int x = 4;
		int n = 7;
		for(long ss : sol.solution(x, n))
			System.out.print(ss + " ");
	}
}
