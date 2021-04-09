
public class lv1_reverseTernaryNum {
	public int solution(int n) {
        int answer = 0;
        String s = "";
        while(true) {
        	int div = n/3;
        	int val = n%3;
        	n = div;
        	s+= val;
        	if(n == 0) break;
        }
//        int j = 0 ;
//        for(int i = s.length()-1 ; i >= 0; i--) {
//        	answer += (int)(s.charAt(i)-'0')*(int)Math.pow(3, j);
//        	j++;
//        }
        return Integer.parseInt(s,3);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv1_reverseTernaryNum sol = new lv1_reverseTernaryNum();
		int n = 45;
		//System.out.println(Math.pow(3, 0));
		System.out.println(sol.solution(n));
	}

}
