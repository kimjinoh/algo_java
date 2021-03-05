
public class divisorSum {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1 ; i <= n; i++){
            if(n%i==0)
                answer += i;
        }
        return answer;
    }
	public static void main(String[] args) {
		int n = 12;
		divisorSum sol = new divisorSum();
		System.out.println(sol.solution(n));
	}

}
