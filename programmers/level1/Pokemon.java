import java.util.*;

public class Pokemon {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            //우선 중복 값 제거 
            for(int i=0; i<nums.length; i++){
                if(!arr.contains(nums[i])){
                    arr.add(nums[i]);
                }
            }
            
            //중복 값 제거한 값과 nums 나누기 2한 값 비교 
            answer = arr.size() < (nums.length/2) ? arr.size() : (nums.length/2);
            
            return answer;
        }
    }
}
