public class dartGame {
    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            int arr[] = new int[3]; //다트게임 총 횟수
            int idx = 0, intCnt = 0;
            for (int i = 0; i < dartResult.length(); i++) {
                // 문자 하나씩 가져오기
                char dart = dartResult.charAt(i);
                int dartInt = Character.getNumericValue(dart);

                // 점수 인 지 확인
                if (dartInt >= 0 && dartInt <= 10) {
                    if (dartInt == 1) {
                        if (Character.getNumericValue(dartResult.charAt(i + 1)) == 0) {
                            dartInt = 10;
                            i++;
                        }
                    }
                    arr[idx] = dartInt; //정수값 넣기
                    intCnt++;

                } else {
                    switch (dart) {
                    case 'S': //1차 제곱
                        arr[idx] = (int) Math.pow(arr[idx], 1);
                        idx++;
                        break;
                    case 'D': //2차 제곱
                        arr[idx] = (int) Math.pow(arr[idx], 2);
                        idx++;
                        break;
                    case 'T': //3차 제곱
                        arr[idx] = (int) Math.pow(arr[idx], 3);
                        idx++;
                        break;
                    case '*': //스타상 
                        idx = idx - 2 < 0 ? 0 : idx - 2;
                        while (idx < intCnt) {
                            arr[idx] = arr[idx] * 2;
                            idx++;
                        }
                        break;
                    case '#': // 아차상
                        arr[idx - 1] = arr[idx - 1] * (-1);
                        break;
                    }
                }

            }
            answer = arr[0] + arr[1] + arr[2];
            return answer;
        }
    }
}