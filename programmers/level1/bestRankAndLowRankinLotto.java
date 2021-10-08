public class bestRankAndLowRankinLotto{
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int cnt = 0; //카운트 용 변수 
            int zeroCnt = 0; //0으로 지워진 수를 구하기 위한 변수
            //로또 맞은 수 카운트 하기 
            for(int i=0; i<lottos.length; i++){
                for(int j=0; j<win_nums.length; j++){
                    if(win_nums[i] == lottos[j]){
                        cnt++;
                        break;
                    }
                }
                if(lottos[i] == 0){
                    zeroCnt++;
                }            
            }
            return Result(cnt, zeroCnt);
        }
        //로또 최고 순위와 최저 순위 구하는 클래스
        private int[] Result(int cnt, int zeroCnt){
            int[] tmp = {cnt+zeroCnt,cnt};
            int[] result = new int[2];
            for(int i=0; i<tmp.length; i++){
                switch(tmp[i]){
                    case 6: 
                        result[i] = 1;
                        break;
                    case 5: 
                        result[i] = 2;
                        break;
                    case 4: 
                        result[i] = 3;
                        break;
                    case 3: 
                        result[i] = 4;
                        break;
                    case 2: 
                        result[i] = 5;
                        break;
                    default: 
                        result[i] = 6;
                        break;
                }
            }
            return result;
        }
    }
}