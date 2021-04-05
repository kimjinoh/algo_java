
public class lv1_newID {
	public String solution(String new_id) {
		String answer = "";
//		String s2 = "";
//		String s4 = "";
//		String s4_2 = "";
//		String s6 = "";
//		String s6_2 = "";
		new_id = new_id.toLowerCase();
		System.out.println("1단계: "+ new_id);
//		for (int i = 0; i < new_id.length(); i++) {
//			if (((int) new_id.charAt(i) >= 97 && (int) new_id.charAt(i) <= 122)
//					|| ((int) new_id.charAt(i) >= 48 && (int) new_id.charAt(i) <= 57) || new_id.charAt(i) == '-'
//					|| new_id.charAt(i) == '_' || new_id.charAt(i) == '.')
//				s2 += new_id.charAt(i);
//		}
//		new_id = s2;
		new_id = new_id.replaceAll("[^-_.a-z0-9]", "");
		System.out.println("2단계: "+ new_id);
//		while(new_id.contains(".."))
//			if(new_id.contains(".."))
//				new_id = new_id.replace("..", ".");
		new_id = new_id.replaceAll("[.]{2,}", ".");
		System.out.println("3단계: "+ new_id);
		new_id = new_id.replaceAll("^[.]|[.]$", "");
//		if(new_id.charAt(0)=='.') {
//			for(int i = 1 ; i < new_id.length(); i++)
//				s4 += new_id.charAt(i);
//			new_id = s4;
//		}
//		System.out.println("4단계: "+ new_id);
//		if(new_id.length() != 0 && new_id.charAt(new_id.length()-1)=='.') {
//			for(int i = 0 ; i < new_id.length()-1; i++)
//				s4_2 += new_id.charAt(i);
//			new_id = s4_2;
//		}
		System.out.println("4단계: "+ new_id);
		if(new_id.length() == 0) {
			new_id = "a";
		}
		System.out.println(new_id.length());
		System.out.println("5단계: "+ new_id);
		if(new_id.length()>=16) {
			new_id = new_id.substring(0,15);
			new_id = new_id.replaceAll("[.]$", "");
		}
		System.out.println("6단계: "+ new_id);
		if(new_id.length() <= 2)
			while(new_id.length() < 3)
				new_id += new_id.charAt(new_id.length()-1);
		answer = new_id;
		System.out.println("7단계: "+ new_id);
		return answer;
	}

	public static void main(String[] args) {
		String new_id = "...abcdefghijklmn....p";
		lv1_newID sol = new lv1_newID();
		System.out.println(sol.solution(new_id));
	}

}
