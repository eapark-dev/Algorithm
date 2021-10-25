import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        Arrays.sort(stages);
        // key, value 넣을 map 생성
        HashMap<Integer, Double> map = new HashMap<>();
        int tot = stages.length;
        for (int i = 1; i <= N; i++) {
            // 실패한 사람 수 세기 위한 카운트 변수 선언
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i == stages[j]) { // 값이 같으면 카운트
                    cnt++;
                }
            }
            if (cnt == 0) { // 0은 나눌 수 없으므로 0이면 map에 0 넣음
                map.put(i, (double) 0);
                continue;
            }
            // 실패율 계산해서 map에 넣기
            map.put(i, (double) cnt / (double) tot);
            tot = tot - cnt;
        }
        // 실패율 내림차순 정렬
        List<Integer> keySetList = new ArrayList<Integer>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        int i = 0;
        for (Integer key : keySetList) {
            i++;
            answer[i - 1] = key;
        }

        return answer;
    }
}