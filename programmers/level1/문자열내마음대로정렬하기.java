import java.util.Arrays;
public class 문자열내마음대로정렬하기 {
    class Solution {
        public String[] solution(String[] strings, int n) {
            Arrays.sort(strings);
            String tmp = "";
            String[] spe = new String[strings.length];
            String[] answer = new String[strings.length];
    
            for(int i=0; i<strings.length; i++){
                tmp = strings[i];
                spe[i] = strings[i].substring(n,n+1) + "," + strings[i];
            }
            Arrays.sort(spe);
            for(int i=0; i<spe.length; i++) {
                answer[i] = spe[i].split(",")[1];
            }
            
            return answer;
        }
    }
}
