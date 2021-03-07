
public class caesarCipher {
//    public String solution(String s, int n) {
//        String answer = "";
//        char[] arr = new char[s.length()];
//		for(int i = 0 ; i < s.length(); i++) {
//			if(s.charAt(i) == ' ')
//				arr[i] ='/';
//			if(s.charAt(i) >= 'a' && s.charAt(i) <='z') {
//				if((int) (s.charAt(i)+n) > 122 )
//					arr[i] = (char) (s.charAt(i)+n-26);
//				else arr[i] = (char) (s.charAt(i)+n);
//			}
//			else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z') {
//				if((int) (s.charAt(i)+n) > 90 )
//					arr[i] = (char) (s.charAt(i)+n-26);
//				else arr[i] = (char) (s.charAt(i)+n);
//			}
//		}
//        answer = String.valueOf(arr);
//        answer = answer.replace('/', ' ');
//        return answer;
//    }
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLowerCase(ch))
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			else if (Character.isUpperCase(ch))
				ch = (char) ((ch - 'A' + n) % 26 + 'A');
			answer += ch;
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A BZ a";
		int n = 25;
		caesarCipher sol = new caesarCipher();
		System.out.println(sol.solution(s, n));
	}

}
