import java.util.*;
public class supo {
    public int[] solution(int[] answers) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] supo1 = {1, 2, 3, 4, 5};
        int[] supo2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supo3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5,};
        int[] count = {0, 0, 0};
        for(int i = 0; i < answers.length; i++){
            if(supo1[i%supo1.length] == answers[i])
                count[0]++;
            if(supo2[i%supo2.length] == answers[i])
                count[1]++;
            if(supo3[i%supo3.length] == answers[i])
                count[2]++;
        }
        int max = count[0];
        for(int i = 1; i<3; i++){
            if(max < count[i])
                max = count[i];
        }
        for(int i = 0; i<3; i++){
            if(count[i] == max)
                arr.add(i+1);
        }
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i<arr.size(); i++)
            answer[i] = arr.get(i);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,2,3,4,5,3,4,5,2,4};
        supo sol = new supo();
        System.out.println(sol.solution(answers));
	}

}
