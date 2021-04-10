//import java.util.*;
public class lv1_notCompletion {
//	public String solution(String[] participant, String[] completion) {
//        String answer = "";
//        List<String> part = new ArrayList<String>();
//        List<String> comp = new ArrayList<String>();
//        Collections.addAll(part, participant);
//        Collections.addAll(comp, completion);
//        int parti = 0 ; 
//        int compl = 0;
//        for(int i = 0 ; i < part.size(); i++) {
//        	parti+=part.get(i).hashCode();
//        }
//        for(int i = 0 ; i < comp.size(); i++) {
//        	compl+=comp.get(i).hashCode();
//        }
//        int aaaa = parti - compl;
//        System.out.println(aaaa);
//        for(int i = 0 ; i < part.size(); i++) {
//        	if(aaaa == part.get(i).hashCode())
//        		answer = part.get(i);
//        }
//        return answer;
//    }
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        int parti = 0 ; 
        int compl = 0;
        for(int i = 0 ; i < participant.length; i++) {
        	parti+=participant[i].hashCode();
        }
        for(int i = 0 ; i < completion.length; i++) {
        	compl+=completion[i].hashCode();
        }
        int aaaa = parti - compl;
        for(int i = 0 ; i < participant.length; i++) {
        	if(aaaa == participant[i].hashCode())
        		answer = participant[i];
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] part = {"marina", "vinko", "nikola", "vinko", "filipa"};
		String[] comp = {"vinko", "filipa", "marina", "nikola"};
		lv1_notCompletion sol = new lv1_notCompletion();
		System.out.println(sol.solution(part, comp));
	}

}
