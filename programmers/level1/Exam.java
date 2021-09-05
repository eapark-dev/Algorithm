import java.util.ArrayList;
public class Exam {
    class Solution {
        public int[] solution(int[] answers) {
            int[] answer = {};
            int[] one = {1,2,3,4,5};
            int[] two = {2,1,2,3,2,4,2,5};
            int[] three = {3,3,1,1,2,2,4,4,5,5};
            int cntOne = 0;
            int cntTwo = 0;
            int cntThree = 0;
        
            //1번 학생이 답을 맞히는 경우
            for(int i=0; i<answers.length; i++){
                if(answers[i] == one[i%5]){
                    cntOne++;
                }
            }   
            //2번 학생이 답을 맞히는 경우
            for(int i=0; i<answers.length; i++){
                if(answers[i] == two[i%8]){
                    cntTwo++;
                }
            }     

            //3번 학생이 답을 맞히는 경우   
            for(int i=0; i<answers.length; i++){
                if(answers[i] == three[i%10]){
                    cntThree++;
                }
            }        
            int max = Math.max(Math.max(cntOne, cntTwo),cntThree); // max값 구하기
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            if ( max == cntOne) tmp.add(1);
            if ( max == cntTwo) tmp.add(2);
            if ( max == cntThree) tmp.add(3);
            
            answer = new int[ tmp.size()];
            for( int i=0; i<tmp.size(); i++){
                answer[i] = tmp.get(i);
            }
            
            return answer;
            
            
        }
    }
}
