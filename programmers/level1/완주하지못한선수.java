import java.util.Arrays;
class Solution4 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int num = 0;
        String tmp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
       
        for(int i=0; i<completion.length; i++) {
            if(participant[i].equals(completion[i])){
                num++;
            }else{
                tmp = participant[i];
                break;
            }
        }
       
        if(num == completion.length){
            tmp = participant[num];
        }
        answer = tmp;
        
        return answer;
    }
}