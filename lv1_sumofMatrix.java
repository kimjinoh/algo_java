
public class lv1_sumofMatrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		lv1_sumofMatrix sol = new lv1_sumofMatrix();
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = { { 4, 2, 3 }, { 4, 1, 2 } };
		for (int[] ss : sol.solution(arr1, arr2))
			for (int sss : ss)
				System.out.print(sss + " ");
	}

}
