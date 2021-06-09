import java.util.*;

public class 두개뽑아서더하기 {

    class Solution {
        public int[] solution(int[] numbers) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();
            int tmp = 0;
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                tmp = numbers[i];
                for (int j = i + 1; j < numbers.length; j++) {
                    sum = tmp + numbers[j];
                    list.add(sum);
                }
            }

            int[] answer = {};
            for (int i = 0; i < list.size(); i++) {
                if (!list2.contains(list.get(i))) {
                    list2.add(list.get(i));
                }
            }
            answer = new int[list2.size()];

            for (int i = 0; i < list2.size(); i++) {
                answer[i] = list2.get(i);
            }
            Arrays.sort(answer);
            return answer;
        }
    }
}
