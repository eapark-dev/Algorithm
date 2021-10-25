import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        HashMap<Integer,Double> map = new HashMap<>();
        int tot = stages.length;
        for(int i = 1; i<=N; i++){
            int cnt = 0;
            for(int j=0; j<stages.length; j++){
                if(i == stages[j]){
                    cnt++; 
                }
            }   
            if(cnt == 0){
                map.put(i,(double)0);
                continue;
            }
            
            map.put(i,(double)cnt/(double)tot);
            tot = tot -cnt;
        }
        
        List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1)))); // 실패율 내림차순 정렬
        
        int i=0;
       for(Integer key : keySetList) { 
            i++;
            answer[i-1] = key;
            
       }


        
        return answer;
    }
}