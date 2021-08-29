public class Sqrt {
    class Solution {
        public long solution(long n) {
            long answer = 0;
            long num = 0;
            //n이하수만큼 나눠서 n으로 나눴을 때 i가 나오고 나머지가 0인 값을 찾기
            for(int i = 1; i<=n; i++){
                if((n/i) == i && n%i == 0){
                    num = i;
                    break;
                }else{ //아닌 경우
                    num = -1;
                }
            }
    
            if(num != -1){ //맞으면 1 더해서 제곱
                num = (num + 1) * (num + 1);
            }
    
            answer = num;
            
            
            return answer;
        }
    }
}
