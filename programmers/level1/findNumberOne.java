public class findNumberOne {
    class Solution {
        public int solution(int n) {
            int answer = 0;
            //n크기에서 작은 수로 반복하기.
            for(int i=n; i>1; i--){
                //나머지가 1인 가장 작은 수 구하기.
                if(n%i == 1){
                    answer = i;
                }
            }
            return answer;
        }
    }
}