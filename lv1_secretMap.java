
public class lv1_secretMap {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] dec1 = new String[n];
		String[] dec2 = new String[n];
		char[] ch = new char[n];
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				ch[j] = (arr1[i] % 2 == 0) ? '0' : '1';
				arr1[i] /= 2;
			}
			dec1[i] = String.valueOf(ch);
		}
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				ch[j] = (arr2[i] % 2 == 0) ? '0' : '1';
				arr2[i] /= 2;
			}
			dec2[i] = String.valueOf(ch);
		}
		for (int i = 0; i < n; i++) {
			answer[i] = "";
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				answer[i] += (dec1[i].charAt(j) == '1' || dec2[i].charAt(j) == '1') ? "#" : " ";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		lv1_secretMap sol = new lv1_secretMap();
		for (String s : sol.solution(5, arr1, arr2))
			System.out.println(s);
	}

}
