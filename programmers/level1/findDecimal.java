public class findDecimal {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            for(int i=2; i<=n; i++){
                boolean flag = true; //소수인지 판별하는 flag 추가
                for(int j=2; j*j<=i; j++) {
                    if(i % j == 0) {  //0으로 나눠지면 소수가 아니므로 flas = false , if문 나가기
                        flag = false;
                        break; 
                    } 
                }
                
                if(flag){ //flag가 true면 answer 증가
                    answer++;
                }
            }
            return answer;
        }
    }
}
