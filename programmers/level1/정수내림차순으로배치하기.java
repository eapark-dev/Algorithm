public class 정수내림차순으로배치하기 {
    class Solution {
        public long solution(long n) {
            //split이용해 숫자 쪼개기
            String[] tmpArr = Long.toString(n).split("");
            String answer = "";
            
            //내림차순 하기 
            for(int i=0; i<tmpArr.length; i++){
                for(int j = i+1; j<tmpArr.length; j++){
                    if(Integer.parseInt(tmpArr[i]) < Integer.parseInt(tmpArr[j])){
                        String tmp = tmpArr[i];
                        tmpArr[i] = tmpArr[j];
                        tmpArr[j] = tmp;
                    }
                }
            }
            
            for(int i=0; i<tmpArr.length; i++){
                answer += tmpArr[i];
            }
    
            return Long.valueOf(answer);
        }
    }
}
