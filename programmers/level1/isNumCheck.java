public class isNumCheck {
    //프로그래머스 문자열 다루기 
    class Solution {
        public boolean solution(String s) {
            boolean answer = true;
            //숫자 배열로 담기
            String[] num = {"0","1","2","3","4","5","6","7","8","9"};
            String[] str = s.split("");
            int cnt = 0; //숫자인 지 체크하는 카운트
             
            //s가 4또는 6이 아닐 경우 false
            if(str.length != 4 && str.length != 6) {
                answer = false;
            }else{
                //문자열 반복문 숫자인 지 아닌 지 체크 
                for(int i=0; i<str.length; i++){
                    for(int j=0; j<num.length; j++){
                        if(str[i].equals(num[j])){
                            cnt++;
                        }
                    }
                }
    
                if(str.length != cnt){
                    answer = false;
                }   
            
            }
                
            return answer;
        }
    }
}
