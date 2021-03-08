import java.util.*;
public class lv_1_evenOdd {
	public String solution(int num) {
        return (num%2==0)?"Even":"Odd";
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// TODO Auto-generated method stub
		lv_1_evenOdd sol = new lv_1_evenOdd();
		System.out.println(sol.solution(n));
	}
}