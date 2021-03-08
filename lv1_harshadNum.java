
public class lv1_harshadNum {
	public boolean solution(int x) {
        int n = x;
        int sum = 0 ;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return (x%sum==0);
    }
	public static void main(String[] args) {
		int n = 245;
		lv1_harshadNum sol = new lv1_harshadNum();
		System.out.println(sol.solution(n));
	}

}
