package level1_예산;

import java.util.*;

// 내가 푼것

class Solution {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        System.out.println("result : " + solution(d, budget));

    }

    // 1. 계산을 위한 정렬을 한다.
    // 2. 최대한 많이 도와줄 수 있는 Max치를 계산
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;

        // 정렬
        Arrays.sort(d); 

        for(int i=0; i<d.length; i++){ 
            result += d[i]; 
            // 초과되는 경우
            if( result > budget){ 
                answer = i; 
                break;
            }
        }
        // 최대일 경우 2,2,3,3
        if(result <= budget){
            answer = d.length;
        }

        return answer;
    }
}
