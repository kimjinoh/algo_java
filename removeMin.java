import java.util.Arrays;

public class removeMin {
//	public int[] solution(int[] arr) {
//		int[] answer = {};
//        int[] arr1 = new int[arr.length];
//        for(int i = 0 ; i < arr.length; i++)
//            arr1[i] = arr[i];  
//        if(arr.length == 1) {
//        	answer = new int[1];
//        	answer[0] = -1;
//        }
//        else {
//        	Arrays.sort(arr);
//        	answer = new int[arr.length-1];
//            int count = 0 ;
//        	for(int i = 0 ; i < arr.length ; i++) {
//                if(arr1[i] != arr[0]){
//                    answer[count] = arr1[i];
//                    count ++;
//                }
//        	}
//        }
//        return answer;
//    }
	public int[] solution(int[] arr) {
		int[] answer = {}; 
        if(arr.length == 1) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	answer = new int[arr.length-1];
        	int min = arr[0] ;
        	int count = 0 ;
        	for(int i = 0 ; i < arr.length; i++) {
        		if(min > arr[i])
        			min = arr[i];
        	}
        	for(int i = 0 ; i < arr.length; i++) {
        		if(arr[i] != min) {
        			answer[count] = arr[i];
        			count++;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		// TODO Auto-generated method stub
		removeMin sol = new removeMin();
        System.out.println(sol.solution(arr));
	}

}
