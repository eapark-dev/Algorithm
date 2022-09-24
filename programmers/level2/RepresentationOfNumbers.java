//프로그래머스 - 숫자의 표현
/*
 숫자를 순차적으로 돌리면서 합셈이 n과 같으면 카운트 하는 방식으로 접근하였다.
 */
public class RepresentationOfNumbers {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = i; j <= n; j++) {
                    sum += j;

                    if (sum == n) {
                        answer++;
                        break;
                    } else if (sum > n)
                        break;
                }
            }
            return answer;
        }
    }
}