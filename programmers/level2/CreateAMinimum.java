import java.util.*;
public class CreateAMinimum{
    class Solution
    {
        public int solution(int []A, int []B)
        {
            int answer = 0;
            //int[] to ArrayList
            ArrayList<Integer> aList = new ArrayList<Integer>();
            ArrayList<Integer> bList = new ArrayList<Integer>();

            for(int i=0; i<A.length; i++){
                aList.add(A[i]);
                bList.add(B[i]);
            }
            //A배열은 오름차순
            Collections.sort(aList);
            //B배열은 내림차순
            Collections.sort(bList);
            Collections.reverse(bList);

            //A와 B곱하기
            for(int i=0; i<aList.size(); i++){
                answer += (aList.get(i) * bList.get(i));
            }
            
            return answer;
        }
    }
}