
public class lv1_pushKey {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        int l_state = 10 ;
        int r_state = 12 ;
        int l_dis = 0 ;
        int r_dis = 0;
        int i1,j1,i2,j2,i3,j3 ;
        i1=j1=i2=j2=i3=j3=0;
        int[][] keypad = {{1,2,3},{4,5,6},{7,8,9},{10,0,12}};
        for(int i = 0 ; i < numbers.length; i++) {
        	if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
        		answer += "L";
        		l_state = numbers[i];
        	}
        	else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
        		answer += "R";
        		r_state = numbers[i];
        	}
        	else// number -> 2,5,8,0
        	{
        		for(int y = 0; y < 3; y++)
        			for(int x = 0; x < 4; x++) {
        				if(numbers[i] == keypad[x][y]) {
        					i1 = x;
        					j1 = y;
        				}
        				if(l_state == keypad[x][y]) {
        					i2 = x;
        					j2 = y;
        				}
        				if(r_state == keypad[x][y]) {
        					i3 = x;
        					j3 = y;
        				}
        			}
        		l_dis = (int)Math.abs(j2-j1)+(int)Math.abs(i2-i1);
        		r_dis = (int)Math.abs(j3-j1)+(int)Math.abs(i3-i1);
        		if(r_dis > l_dis) {
        			answer += "L";
        			l_state = numbers[i];
        		}
        		else if(l_dis > r_dis) {
        			answer += "R";
        			r_state = numbers[i];
        		}
        		else {
        			if(hand.equals("right")) {
        				answer += "R";
            			r_state = numbers[i];
        			}
        			else {
        				answer += "L";
            			l_state = numbers[i];
        			}
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lv1_pushKey sol = new lv1_pushKey();
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		System.out.println(sol.solution(numbers, hand));
	}

}
