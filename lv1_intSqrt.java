import java.util.*;
public class lv1_intSqrt {
	public long solution(long n) {
        long answer = 0;
        long ans = (long)Math.sqrt(n);
        if(n == ans*ans)
            answer = ans;
        else return -1;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv1_intSqrt sol = new lv1_intSqrt();
		long aaaa = 144;
		System.out.println(sol.solution(aaaa));
	}

}
