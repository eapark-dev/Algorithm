class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        //arr길이만큼 반복
        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }
        //answer에 들어있는 값을 배열에 들어있는 개수만큼 나누어 평균 구함
        answer = answer/arr.length;
        
        return answer;
    }
}