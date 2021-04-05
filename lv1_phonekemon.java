import java.util.*;
public class lv1_phonekemon {
	public int solution(int[] nums) {
		Set<Integer> intSet = new HashSet<>();
//		Integer[] arr = new Integer[nums.length];
//		for(int i = 0 ; i < nums.length; i++) {
//			arr[i] = (Integer)nums[i];
//			System.out.println(arr[i]);
//		}
		for(int i = 0 ; i < nums.length; i++)
			intSet.add(nums[i]);
		// intSet.addAll(Arrays.asList(nums));
		System.out.println(intSet);
        int answer = 0;
        int n = nums.length/2;
        int cnt = intSet.size();
        if(cnt>n)
        	answer = n;
        else
        	answer = cnt;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,3,3,2,2,4};
		lv1_phonekemon sol = new lv1_phonekemon();
		System.out.println(sol.solution(nums));
	}

}
