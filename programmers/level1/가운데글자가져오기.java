public class 가운데글자가져오기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            int sLen = s.length();
            int strNum = 0;
    
            if((s.length() % 2) == 0) {
                strNum = (sLen-2)/2;
                answer = s.substring(strNum,strNum+2);
            }else {
                strNum = (sLen-1)/2;
                
                answer = s.substring(strNum,strNum+1);
            }
            
            return answer;
        }
    }
}
