public class firstDartGame {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            //스타상일 경우 첫번째에 * 들어가면 그곳만 *2 다른곳 있으면 중첩되서 *2 *2 
            //스타상 있을 경우 전과 그 자리에 *2 
            //아차상일 경우 그 자리 *(-1)
            int[] arr = new int[3];
            for(int i=0; i<dartResult.length(); i++){
                char dartChar = dartResult.charAt(i);
                int dartInt = Character.getNumericValue(dartChar); 
    
            }
            return answer;
        }
    }
}
