package level1_예산;

import java.util.*;

// 남이 푼것

public class Solution2 {
    
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        System.out.println("result : " + solution(d, budget));
    }

    private static int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++ ){
            budget -= d[i];
            if( budget < 0 ) break;
            answer++;
        }

        return answer;
    }
}
