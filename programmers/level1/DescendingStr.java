public class  DescendingStr{
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] arr = s.split(""); //해당 문자 split으로 한개씩 만들기
            
            for(int i=0; i<arr.length; i++){ //반복문을 통해 비교하기
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i].charAt(0) < arr[j].charAt(0)){ //아스키 코드 이용해 내림차순 하기
                        String tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp; 
                    }
                }
                
                answer += arr[i]; //내림 차순 값을 answer에 넣기
            }
            
            return answer;
        }
    }
}