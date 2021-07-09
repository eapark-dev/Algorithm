public class 핸드폰번호가리기 {
    class Solution {
        public String solution(String phone_number) {
            String temp = "";
            String answer = "";
            for(int i=0; i<phone_number.length()-4; i++){
                temp += "*";
            }
            answer = phone_number.replace(phone_number.substring(0,phone_number.length()-4),temp);
            return answer;
        }
    }
}
