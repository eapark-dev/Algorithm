public class stringNumberChangeInt {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            //0-9까지 영어 숫자 배열에 담기.
            String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};    
        
            //담은 배열만큼 반복문
            for(int i=0; i<number.length; i++){
                //s에 들어있는 값들 중 number에 있는 문자를 replace함.
                s = s.replaceAll(number[i],Integer.toString(i));
            }
            
            answer = Integer.parseInt(s);
            
            return answer;
        }
    }
}
