public class StrangeString{
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] str = s.split(" ", -1);
            for(int i =0; i<str.length; i++){
                String[] tmpStr = str[i].split("");
                for(int j=0; j<tmpStr.length; j++){
                    if(j % 2 == 0) {
                        tmpStr[j] = tmpStr[j].toUpperCase(); 
                    }else{
                        tmpStr[j] = tmpStr[j].toLowerCase();
                    }
                    answer += tmpStr[j];
                }
                
                if(i==str.length-1) continue;
                answer += " ";
            }
            
            return answer;
        }
    }
}