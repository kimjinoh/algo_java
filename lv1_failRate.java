public class lv1_failRate {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int n = stages.length;
        double[] failRate = new double[N];
        for(int i = 1 ; i < N+1; i++) {
        	int index = 0 ;
        	int count = 0;
        	answer[i-1] = i;
        	while(index < stages.length) {
        		if(stages[index]==i) {
        			count ++;
        		}
        		index++;
        	}
        	failRate[i-1] = (double)count/n;
        	n -= count;
        	if(n<=0)
        		break;
        }
        for(int i = 0 ; i < N ; i++) {
        	for(int j = i+1; j < N; j++) {
        		if(failRate[i]<failRate[j]) {
        			double tmp = failRate[i];
        			failRate[i] = failRate[j];
        			failRate[j] = tmp;
        			int ind = answer[i];
        			answer[i] = answer[j];
        			answer[j] = ind;
        		}
        		else if(failRate[i]==failRate[j]) {
        			if(answer[i]>answer[j]) {
        				int ind = answer[i];
            			answer[i] = answer[j];
            			answer[j] = ind;
        			}
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int[] stages = {4,4,4,4,4};
		lv1_failRate sol = new lv1_failRate();
		for(int ans : sol.solution(N, stages))
			System.out.println(ans);
	}

}
