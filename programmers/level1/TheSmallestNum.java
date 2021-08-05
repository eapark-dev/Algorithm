import java.util.*;
public class TheSmallestNum {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            ArrayList<Integer> array = new ArrayList<Integer>();
            int tmp = arr[0];
            for(int i=0; i<arr.length; i++){
                array.add(arr[i]);
                if(tmp > arr[i]){
                    tmp = arr[i];
                }
            }
        
            for(int i=0; i<array.size(); i++){
                if(array.get(i) == tmp){
                    array.remove(i);
                }
            }
            
            if(array.size() == 0){
                answer = new int[1];
                answer[0] = -1;
            }else{
                answer = new int[array.size()];
                for(int i=0; i<array.size(); i++){
                    answer[i] = array.get(i);
                }
            }
            
            return answer;
        }
    }
}
