import java.util.*;
public class intSqrt {
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
		intSqrt sol = new intSqrt();
		long aaaa = 144;
		System.out.println(sol.solution(aaaa));
	}

}
