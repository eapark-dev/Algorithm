import java.util.*;

public class HateSameNum {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<Integer>(); //동적할당을 위해 ArrayList사용
 
        for(int i=0; i<arr.length; i++){
            if(i != arr.length-1){ //배열의 마지막 값이 아닌 거 까지 값을 비교후 같지 않으면 array에 담음
                if(arr[i] != arr[i+1]){
                    array.add(arr[i]);
                }
            }else{
                array.add(arr[arr.length-1]); //맨 마지막 값은 항상 비교할 대상이 없으므로 넣음.
            }
        }

        answer = new int[array.size()]; //array size만큼 answer 배열 할당
        
        for(int i=0; i<array.size(); i++){ //반복문 통해 answer에 array값 넣음.
            answer[i] = array.get(i);
        }
        
        return answer;
    }
}
