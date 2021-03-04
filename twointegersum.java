
public class twointegersum {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		// TODO Auto-generated method stub
		class Solution{
			public long solution(int a, int b) {
				if(a>b) {
					int tmp = a;
					a = b;
					b = tmp;
				}
				long answer = 0;
				int c = b-a;
				for(int i = 0; i <= c; i++) {
					answer += a;
					a++;
				}
				return answer;
			}
		}
		Solution sol = new Solution();
		System.out.println(sol.solution(a,b));
	}

}
