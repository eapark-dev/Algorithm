public class caesarCipher {
    class Solution {
        public String solution(String s, int n) {
            String answer = "";
            String[] arr = s.split("");
            for(int i=0; i<arr.length; i++){
                char ch = arr[i].charAt(0);
                int num = (int)ch;
                if(num != 32){
                    if(num <= 90){
                        if(num + n > 90){
                            num = 64 + (num - 90)+ n;
                        }else {
                            num = num + n;
                        }
                    }else{
                        if(num + n > 122 ){
                            num = 96 + (num - 122) + n;
                        }else {
                            num = num + n;
                        }
                    }
                }
                answer += (char)num;
            }
            return answer;
        }
    }
}
