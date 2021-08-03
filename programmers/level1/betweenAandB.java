public class betweenAandB {
    public long solution(int a, int b) {
        long answer = 0;
        int num = 0; // 최소 값을 위한 변수
        int len = 0; // 최대 값을 위한 변수
        if(a < b){
            num = a;
            len = b;
        }else{
            num = b;
            len = a;
        }
        
        for(int i = num; i<=len; i++){
            answer += i;
        }
        return answer;
    }
}
