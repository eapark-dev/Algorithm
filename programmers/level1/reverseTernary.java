public class reverseTernary {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            String ter = "";
            //3진법 변환
            while(n > 0){
                ter += Long.toString(n%3);
                n = n/3;
            }           
            //모든 진수를 10진수로 변환한다.     
            answer = Integer.parseInt(ter,3);
            
            return answer;
        }
    }
}
