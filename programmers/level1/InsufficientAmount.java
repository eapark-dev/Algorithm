//부족한 금액 계산하기
public class InsufficientAmount {
    class Solution {
        public long solution(int price, int money, int count) {
            long answer = -1;
            long totalPrice = 0;
            for(int i=1; i<count+1; i++){
                totalPrice += price * i; //타고싶은 숫자 만큼의 총 놀이동안 이용료 구하기
            }
        
            if(totalPrice <= money){ //총 이용료가 가지고 있는 금액보다 작거나 같으면 0
                answer = 0;
            }else{ // 아닌 경우 필요 금액 구하기
                answer = totalPrice - money;    
            }
            
            return answer;
        }
    }
}