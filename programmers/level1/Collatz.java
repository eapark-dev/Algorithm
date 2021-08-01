public class Collatz {
    class Solution {
        public int solution(int num) {
            int answer = 0;
            int cnt = 0; //카운트용 변수
            long i = (long)num; //int는 자릿수 제한이 있어 long형으로 값 넣음
            while(i != 1){ //반복문 실행 
                cnt++;
                
                if(i % 2 == 0) {
                    i = i/2;
                }else{
                    i = (i * 3) + 1;
                }
                
                if(i == 1){
                    break;
                }
            }
            
            if(cnt >= 500){ //카운트 500 이상이면 -1 리턴
                answer = -1;
            }else{
                answer = cnt;   
            }
            
            return answer;
    
        }
    }
}
