
public class naturalToArray {
//	public int[] solution(long n) {
//        int length = (int) (Math.log10(n) + 1);
//		int[] answer = new int[length];
//		for (int i = length - 1; i >= 0; i--) {
//			answer[i] = (int) (n / Math.pow(10, i));
//			n -= answer[i] * Math.pow(10, i);
//		}
//        return answer;
//    }
	public int[] solution(long n) {
		String s = ""+n;
		int[] answer = new int[s.length()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = (int) (n%10);
			n/=10;
		}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 1234555555;
		naturalToArray sol = new naturalToArray();
		for (int ss : sol.solution(n))
			System.out.print(ss);
	}

}
