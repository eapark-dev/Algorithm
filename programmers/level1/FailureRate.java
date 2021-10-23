import java.util.*;
public class FailureRate{
    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Arrays.sort(stages);
            int[] arr = new int[N];
            int tot = stages.length;
            for(int i = 1; i<=N; i++){
                int cnt = 0;
                for(int j=0; j<stages.length; j++){
                    if(i == stages[j]){
                        cnt++; 
                    }
                }    
                arr[i-1] = (int)Math.round((double)cnt/(double)tot * 100);
                tot = tot -cnt;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
         
            for(int i=0; i<arr.length; i++){
                map.put(i+1,arr[i]);
            }
            
            
            return answer;
        }
    }

}