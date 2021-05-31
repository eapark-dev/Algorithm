public class 음양더하기 {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            int tmp = 0;
            
            for(int i=0; i<absolutes.length; i++) {
                if(signs[i] == false) {
                   tmp = -1 * absolutes[i]; 
                }else{
                    tmp = absolutes[i];
                }
                answer += tmp;
            }
            
            return answer;
        }
    }
}
