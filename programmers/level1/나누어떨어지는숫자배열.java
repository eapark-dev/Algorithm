import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            String temp = "";
            String[] tempSplit = {};
            
            //나누어 떨어지는 값의 개수 구하기
            for(int i=0; i<arr.length; i++){
                if((arr[i]%divisor) == 0){
                temp += arr[i] + "/"; //임시 변수에 나누어 떨어지는 값 넣기
                }
            }
            //temp가 빈값이면 나누어 떨어지는 값이 없으므로 -1 넣기
            if(temp == ""){
                answer = new int[1];
                answer[0] = -1;
            }else{ //아닌 경우 temp에 넣어있는 값을 answer에 넣기
                tempSplit = temp.split("/");
                answer = new int [tempSplit.length];
                for(int i=0; i<tempSplit.length; i++){
                    answer[i] += Integer.parseInt(tempSplit[i]);
                }
            }
            
            Arrays.sort(answer);
            
            return answer;
        }
    }
}
