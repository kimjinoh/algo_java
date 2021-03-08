
public class lv1_dartResult {
	public int solution(String dartResult) {
        int answer = 0;
        int sum = 0 ;
        int[] score = new int[3];
        int index = 0;
        char[] ch = dartResult.toCharArray();
        for(int i = 0 ; i < ch.length; i++) {
        	if(ch[i] >= '0' && ch[i] <= '9') {
        		if(ch[i]=='1' && ch[i+1] == '0') {
        			sum = 10;
        			i++;
        			continue;
        		}
        		else sum = ch[i] - '0';
        	}
        	else if(ch[i] == 'S') {
        		score[index] = sum;
        		index++;
        	}
        	else if(ch[i] == 'D') {
        		score[index] = (int)Math.pow(sum, 2);
        		index++;
        	}
        	else if(ch[i] == 'T') {
        		score[index] = (int)Math.pow(sum, 3);
        		index++;
        	}
        	else if(ch[i]=='#')
        		score[index-1] *= -1;
        	else if(ch[i] == '*') {
        		if(index-1 == 0)
        			score[index-1] *= 2;
        		else {
        			score[index-2] *= 2;
        			score[index-1] *= 2;
        		}
        	}
        }
        for(int s : score)
        	answer+=s;
        return answer;
    }
	public static void main(String[] args) {
		String dart = "1T2D3D#";
		lv1_dartResult sol = new lv1_dartResult();
		System.out.println(sol.solution(dart));
	}
}
