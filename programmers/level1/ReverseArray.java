public class ReverseArray {
    class Solution {
        public int[] solution(long n) {
            int[] answer = {};
            String tmp = Long.toString(n); //n을 string으로 변환다.
            String[] arr = tmp.split(""); //split을 이용해 숫자 한개씩 배열에 담는다.
            answer = new int[arr.length]; //배열길이만큼 초기화 
            int len = arr.length-1; //공통 값 
            for(int i=len; i>-1 ; i--){ //배열 길이만큼 거꾸로 반복한다.
                answer[len-i] = Integer.parseInt(arr[i]); //값을 answer에 담는다.
            }
            
            return answer;
        }
    }
}
