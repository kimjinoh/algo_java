
public class lv1_greedy {
	public int solution(int n, int[] lost, int[] reserve) {
//		int answer = n - lost.length;
//		for (int i = 0; i < lost.length; i++)
//			for (int j = 0; j < reserve.length; j++) {
//				if(lost[i] == reserve[j]) {
//					lost[i] = -1;
//					reserve[j] = -1;
//					answer+=1;
//					break;
//				}
//			}
//		for (int i = 0; i < lost.length; i++)
//			for (int j = 0; j < reserve.length; j++)
//				if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j])
//					if (answer < n) {
//						answer += 1;
//						reserve[j] = -1;
//						continue;
//					}
		int[] people = new int[n];
		int answer = n ;
		for(int l : lost)
			people[l-1]--;
		for(int r : reserve)
			people[r-1]++;
		for(int i = 0; i < people.length; i++) {
			if(people[i] == -1) {
				if(i-1>=0&&people[i-1] == 1) {
					people[i]++;
					people[i-1]--;
				}
				else if(i+1<people.length && people[i+1] == 1) {
					people[i]++;
					people[i+1]--;
				}
				else answer--;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[] lost = {1,2,3,4,5};
		int[] reserve = {6,7};
		lv1_greedy sol = new lv1_greedy();
		System.out.println(sol.solution(n, lost, reserve));
	}

}
