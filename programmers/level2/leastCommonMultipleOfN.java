public class leastCommonMultipleOfN {
    static class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int lcm = arr[0];
            for(int i=0; i<arr.length; i++){
                int gcd = gcd(lcm, arr[i]);
                lcm =  lcm * arr[i] / gcd; //최소공배수 구하기
            }
            answer = lcm; //최소공배수 answer에 대입
            return answer;
        }
        
        //최소공배수 구하는 알고리즘 
        //유클리드 호제법
        public int gcd(int a, int b){
            int x = Math.max(a,b);
            int y = Math.min(a,b);
            
            while(x % y != 0){
                int r = x % y;
                x = y;
                y = r;
            }
            
            return y;
        }
    }
}
