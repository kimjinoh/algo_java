
public class lv1_getMean {
	public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int s : arr)
            sum += s;
        answer = (double)sum/arr.length;
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,7,8};
		lv1_getMean sol = new lv1_getMean();
		System.out.println(sol.solution(arr));
	}

}
