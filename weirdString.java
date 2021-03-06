import java.util.*;

public class weirdString {
//	public String solution(String s) {
//        String answer = "";
//		ArrayList<Character> arr = new ArrayList<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			arr.add(s.charAt(i));
//		}
//		String[] ans = new String[arr.size()];
//		int k = 0;
//		for (int i = 0; i < arr.size(); i++) {
//			if (arr.get(i) == ' ') {
//				k = 0;
//				ans[i] = "";
//				continue;
//			}
//			if (k % 2 == 0)
//				ans[i] = Character.toString(arr.get(i)).toUpperCase();
//			else
//				ans[i] = Character.toString(arr.get(i)).toLowerCase();
//			k++;
//		}
//		for (int i = 0; i < ans.length; i++) {
//			if (arr.get(i) == ' ')
//				answer += " ";
//			answer += ans[i];
//		}
//        return answer;
//    }
	public String solution(String s) {
		String answer = "";
		int cnt = 0;
		String[] arr = s.split("");
		for(String ss : arr) {
			cnt = ss.contains(" ")?0:cnt+1;
			answer += cnt%2==0?ss.toLowerCase():ss.toUpperCase();
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		weirdString sol = new weirdString();
		System.out.println(sol.solution(s));
	}

}
