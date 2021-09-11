public class PressDownKeyPad{
    class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";
            int left = 10; //*
            int right = 12; //#
            for(int i=0; i<numbers.length; i++){
                if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7 ){
                    answer += "L";
                    left = numbers[i];
                }
                else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9 ){
                    answer += "R";
                    right = numbers[i];
                }else{
                    //키패드 위치 구하기
                    int leftF = diffNum(left,numbers[i]);
                    int rightF = diffNum(right,numbers[i]);
                    
                    if(leftF > rightF){
                        answer += "R";
                        right = numbers[i];
                    }else if(leftF < rightF){
                        answer += "L";
                        left = numbers[i];
                    }else{
                        if (hand.equals("right")) {
                            answer += "R";
                            right = numbers[i];
                        } else {
                            answer += "L";
                            left = numbers[i];
                        }
                    }
                }
            }
            
            return answer;
        }
    }
    public static int diffNum(int a, int b){
        if(a == 0) a = 11;
        if(b == 0) b = 11;
        
        int aX = (a-1)/3;
        int aY = (a-1)%3;
        int bX = (b-1)/3;
        int bY = (b-1)%3;
        
        int result = Math.abs(aX - bX) + Math.abs(aY - bY);
        
        return result;
        
    }
}
