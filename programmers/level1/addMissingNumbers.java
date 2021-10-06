public class addMissingNumbers{
    class Solution {
        public int solution(int[] numbers) {
            //0-9까지의 합
            int sum = 0;
            //numbers의 합
            int tmpSum =0;
            for(int i=0; i< 10; i++){
                sum += i;
            }
            
            for(int i=0; i<numbers.length; i++){
                tmpSum += numbers[i];
            }
            return sum - tmpSum;
        }
    }
}