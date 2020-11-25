public class Solution {
    
    public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

		System.out.println("result : " + solution(skill, skill_trees));
	}

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++){ // 5
            boolean flag = true;
            String [] skills = skill_trees[i].split("");
            int cnt =0;
            for(int j=0; j<skills.length; j++){ // 3
                // 처음 자릿수와 indexOf 비교
            	if(cnt < skill.indexOf(skills[j])){
                    flag = false;
                    break;
                    // 첫번째 위치인경우
                }else if(cnt == skill.indexOf(skills[j]))
                    cnt++;
            }
            
            // flag true인 경우 이상 무
            if(flag){
                answer++;
            }
            
            // cnt 초기화
            cnt=0;
        }
        return answer;
    }    
}
