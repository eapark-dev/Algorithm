//최댓값과 최솟값
import java.util.*;
public class MaximumAndMinimum {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] tmp = s.split(" ");
            int[] arr = new int[tmp.length];
            
            for(int i=0; i<tmp.length; i++){
                arr[i] = Integer.parseInt(tmp[i]);
            }
            
            Arrays.sort(arr);
            
            answer += Integer.toString(arr[0]) + " " +Integer.toString(arr[arr.length-1]);
            
            return answer;
        }
    }
}
