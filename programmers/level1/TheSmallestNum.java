import java.util.*;
public class TheSmallestNum {
    class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            ArrayList<Integer> array = new ArrayList<Integer>();
            //임시 변수 생성 
            int tmp = arr[0];
            //제일 작은 수 임시 변수에 넣어두기
            for(int i=0; i<arr.length; i++){
                //ArrayList에 값 넣기
                array.add(arr[i]);
                if(tmp > arr[i]){
                    tmp = arr[i];
                }
            }
        
            //임시 변수에 담은 제일 작은 수 삭제 
            for(int i=0; i<array.size(); i++){
                if(array.get(i) == tmp){
                    array.remove(i);
                }
            }
            
            //1개만 들어있으면 임시변수와 같기 떄문에 이미 빈 배열임.
            if(array.size() == 0){
                answer = new int[1];
                answer[0] = -1;
            }else{ //아닌 경우 제일 작은 수를 제거한 배열을 answer에 담기
                answer = new int[array.size()];
                for(int i=0; i<array.size(); i++){
                    answer[i] = array.get(i);
                }
            }
            
            return answer;
        }
    }
}
