import java.util.*;
public class weirdString {
	public String solution(String s) {
        String answer = "";
        ArrayList<String> abc = new ArrayList<String>();
        int sss = 0;
        for(int i = 0; i < s.length(); i++){
            String str ="";
            if(s.charAt(i) == ' '){
                for(int j = sss; j < i; j++){
                    str += s.charAt(j);
                }
                sss = i;
                abc.add(str);
            }
        }
        int size = 0;
        for(int i = 0 ; i < abc.get(i).length(); i++)
            size += abc.get(i).length()
        for(int j = 0; j < abc.size(); j++){
            String word = "";
            for(int i = 0 ; i < abc.get(j).length(); i++){
                
            }
        }
        for(int i = 0; i < abc.get(i).length(); i++){
            if(i%2 == 0)
                ans[i] = Character.toString(arr.get(i)).toUpperCase();
            else
                ans[i] = Character.toString(arr.get(i)).toLowerCase();
            answer += ans[i];
        }
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
        ArrayList<Character> arr =new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' ')
                arr.add(s.charAt(i));
        }
        System.out.println(arr);
	}

}
