public class jadenCase {
    class Solution {
        public String solution(String s) {
            String answer = "";
            String[] sArr = s.split(" ");

            if (s.substring(s.length() - 1, s.length()).equals(" ")) {
                sArr[sArr.length - 1] += " ";
            }

            for (int i = 0; i < sArr.length; i++) {

                char[] tmp = sArr[i].toCharArray();
                for (int j = 0; j < tmp.length; j++) {
                    int num = Character.getNumericValue(tmp[j]);
                    if (j == 0 && num > 10) {
                        answer += String.valueOf(tmp[j]).toUpperCase();
                    } else {
                        answer += String.valueOf(tmp[j]).toLowerCase();
                    }
                }
                if (i != sArr.length - 1) {
                    answer += " ";
                }
            }
            return answer;
        }
    }
}
