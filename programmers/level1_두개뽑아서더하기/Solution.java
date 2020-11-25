package level1_두개뽑아서더하기;

import java.util.*;

// 최종 풀이

public class Solution {
    
    public static void main(String[] args) {
        int[] numbers = {2,9,1,3,4,1,8};

        solution(numbers);
    }

    public static int[] solution(int[] numbers) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                
                treeSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[treeSet.size()];
        int z = 0;
        for(int object : treeSet){
            answer[z++] = object;
        }

        print(answer);

        return answer;
    }

    public static void print(int[] list){
        for(Object object : list){
            System.out.println(object);
        }
    }
}
