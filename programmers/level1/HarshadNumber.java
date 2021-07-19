public class HarshadNumber {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            String[] strNum = Integer.toString(x).split("");
            int a = 0;
            for(int i = 0; i<strNum.length; i++){
                a += Integer.parseInt(strNum[i]);
            }
            
            if(x % a != 0){
                answer = false;   
            } 
            return answer;
        }
    }
}