import java.util.*;
public class printer {
    class Solution {
        public int solution(int[] priorities, int location) {
            //카운트 처음은 1부터 시작
            int answer = 1;
            //우선순위 클래스 PriorityQueue 사용 
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
            //우선순위 클래스  q에 priorities 값 담기
            for(int i=0; i<priorities.length; i++){
                q.add(priorities[i]);
            }
            
            //q가 널이 아닐때 까지 루핑 
            while(!q.isEmpty()){
                for(int i=0; i<priorities.length; i++){
                    // priorities[i] 의 값과 q에 있는 값이 같을 경우 
                    if(priorities[i] == q.peek()){
                        //location 의 위치 카운트 한 answer 리턴하기
                        if(i == location){
                            return answer;
                        }
                        answer++;
                        //조건에 해당할 경우 count 와 함께 q 값 반환과 함께 제거 
                        q.poll();
                    }
                }
            }
            
            return answer;
    
        }
    }
}
