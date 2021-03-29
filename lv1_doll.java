import java.util.*;

public class lv1_doll {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < moves.length; i++)
			for (int j = 0; j < board.length; j++)
				if (board[j][moves[i] - 1] != 0) {
					ans.add(board[j][moves[i] - 1]);
					board[j][moves[i] - 1] = 0;
					break;
				}
		int index = 0;
		while (true) {
			if (index + 1 >= ans.size()) // 모두 같은경우 index + 1 == ans.size()으로 설정할 경우 런타임 에러
				break;
			if (ans.get(index) == ans.get(index + 1)) {
				answer += 2;
				ans.remove(index);
				ans.remove(index);
				if (index != 0)
					index -= 1;
			} else
				index += 1;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		// int [][] board = { {0,0,0},{1,1,1},{1,1,1}};
		// int[] moves = {1,2};
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };
		lv1_doll sol = new lv1_doll();
		System.out.println(sol.solution(board, moves));
	}

}
