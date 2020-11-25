public class Solution {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};

		solution(n, arr1, arr2);
	}

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arrA = new String[n];
        String[] arrB = new String[n];

        for(int i=0; i<n; i++) {
        	if(Integer.toBinaryString(arr1[i]).length() != n) {
        		arrA[i] = "0";
        		for(int j=1; j<(n-Integer.toBinaryString(arr1[i]).length()); j++) {
        			arrA[i] += "0";
        		}
        		arrA[i] = arrA[i] + Integer.toBinaryString(arr1[i]);
        	}else {
        		arrA[i] = Integer.toBinaryString(arr1[i]);
        	}

        	if(Integer.toBinaryString(arr2[i]).length() != n) {
        		arrB[i] = "0";
        		for(int j=1; j<(n-Integer.toBinaryString(arr2[i]).length()); j++) {
        			arrB[i] += "0";
        		}
        		arrB[i] = arrB[i] + Integer.toBinaryString(arr2[i]);
        	}else {
        		arrB[i] = Integer.toBinaryString(arr2[i]);
        	}
        }

        for(int i=0; i<n; i++) {
        	answer[i] = "";
        	for(int j=0; j<n; j++) {
        		if( arrA[i].charAt(j) == '1' || arrB[i].charAt(j) == '1') {
        			answer[i] = answer[i] + "#";
        		}else {
        			answer[i] = answer[i] + " ";
        		}
        	}
        }

        return answer;
    }

}