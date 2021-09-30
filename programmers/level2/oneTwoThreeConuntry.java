public class oneTwoThreeConuntry {
    class Solution {
        public String solution(int n) {
            String answer = "";
            int num = n;
            while(num > 0){
                if(num%3 == 0){
                    answer = "4" + answer;
                    num--;
                }else if(num % 3 == 1){
                    answer = "1" + answer;
                }else 
                {
                    answer = "2" + answer;
                } 
                num = num/3;
                
            }
            return answer;
        }
    }
}
