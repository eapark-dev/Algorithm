public class gvdLcm {
    class Solution {
        public int[] solution(int n, int m) {
            int[] answer = new int[2];
            //최소 공배수 구하기 위해 임시로 넣어둠
            int a = n; 
            int b = m; 
            //최대공약수 구하기
            while(m > 0){
                int tmp = m;
                m = n % m;
                n = tmp;
            }
            //최소 공배수 
            answer[0] = n;
            answer[1] = (a * b) / n;
            
            
            return answer;
            
        }
        
    }
}
