public class Solution {
    
    public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

		System.out.println("result : " + solution(skill, skill_trees));
	}

    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        char start[] = new char[skill.length()-1];
        char end[] = new char[skill.length()-1];

        for(int i=0; i<skill.length()-1; i++) {
        	start[i] = skill.charAt(i);
        	end[i] = skill.charAt(i+1);
        }

        int z = 0;
    	for(int i=0; i<skill_trees.length; i++) {
    		System.out.println( skill_trees[i]  + "------------------");
    		for(int j=0; j<start.length; j++) {
    			System.out.println( skill_trees[i].indexOf(start[j]) + " | " + skill_trees[i].indexOf(end[j]));
    			if( skill_trees[i].indexOf(start[j]) > skill_trees[i].indexOf(end[j]) ) {
    				z--;
    			}
    		}
    		if( z >= 0) {
    			answer++;
    		}
    		z = 0;
    	}


        return answer;
    }
    
}
