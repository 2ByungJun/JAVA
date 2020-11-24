package level1_3진법뒤집기;

public class Solution {
    public static void main(String[] args) {
        int n = 45;

        System.out.println("result : " + solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        String str = "";

        while(n > 0){
            str = (n % 3) + str;
            n /= 3;
        }

        str = ( new StringBuffer(str) ).reverse().toString();
        answer = Integer.parseInt(str, 3);
        return answer;
    }
}
