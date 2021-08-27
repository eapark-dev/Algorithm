public class Sqrt {
    class Solution {
        public long solution(long n) {
            long answer = 0;
            long num = 0;
    
            for(int i = 1; i<=n; i++){
                if((n/i) == i && n%i == 0){
                    num = i;
                    break;
                }else{
                    num = -1;
                }
            }
    
            if(num != -1){
                num = (num + 1) * (num + 1);
            }
    
            answer = num;
            
            
            return answer;
        }
    }
}
