import java.util.*;
public class reverseSort {
	public long solution(long n) {
        long answer = 0;
        String s = "" + n;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String a = "";
        for(int i = arr.length-1 ; i >= 0 ; i--)
            a += arr[i];
        answer = Long.parseLong(a);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 118372;
		reverseSort sol = new reverseSort();
		System.out.println(sol.solution(n));
	}

}
