import java.util.*;

public class lv1_sumOfindex {
	public int[] solution(int[] numbers) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int val = numbers[i] + numbers[j];
				if (ans.indexOf(val) < 0)
					ans.add(val);
			}
		}
		int[] answer = new int[ans.size()];
		for (int i = 0; i < ans.size(); i++)
			answer[i] = ans.get(i).intValue();
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = { 0, 1 };
		lv1_sumOfindex sol = new lv1_sumOfindex();
		for (int i = 0; i < sol.solution(numbers).length; i++)
			System.out.print(sol.solution(numbers)[i]);

	}

}
