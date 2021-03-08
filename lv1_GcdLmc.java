import java.util.*;
public class lv1_GcdLmc {
	int gcd(int a, int b){
        if(b == 0){
            return a;
        }else return gcd(b, a%b);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = n/answer[0] * m;
        return answer;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// TODO Auto-generated method stub
		lv1_GcdLmc sol = new lv1_GcdLmc();
		for(int x : sol.solution(n, m))
			System.out.println(x);
	}

}
