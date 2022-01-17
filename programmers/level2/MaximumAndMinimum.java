//최댓값과 최솟값
import java.util.*;
public class MaximumAndMinimum {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] tmp = s.split(" "); //문자열 split
            int[] arr = new int[tmp.length]; //int 배열 만들기
            
            for(int i=0; i<tmp.length; i++){ //arr 배열에 담기
                arr[i] = Integer.parseInt(tmp[i]);
            }
            
            Arrays.sort(arr); //오름차순 정렬 
            
            //맨 앞에 있는 값과 맨 뒤에 값 넣기
            answer += Integer.toString(arr[0]) + " " +Integer.toString(arr[arr.length-1]);
            
            return answer;
        }
    }
}
