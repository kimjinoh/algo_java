
public class lv1_2016 {
	public String solution(int a, int b) {
        int[] mon = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int sum = 0;
        for(int i = 0; i<a-1 ; i++) {
        	 sum += mon[i];
        }
        sum+=b;
        String answer = "";
        if(sum%7 != 0)
            answer = day[sum%7-1];
        else
            answer = "THU";
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 24;
		lv1_2016 sol = new lv1_2016();
		System.out.println(sol.solution(a, b));
	}

}
