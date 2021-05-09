// 주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
//숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, 
//nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        int a =0;
        int b = 0;
        int c = 0;
        int cnt = 0;
        int allCnt = 0;
        int temp = 0;
        
        for(int i=0; i<nums.length; i++) {
            a = nums[i];
            for(int j = i +1; j< nums.length; j++) {
                b = nums[j];
                for(int k = j + 1; k< nums.length; k++) {
                    allCnt++; 
                    c = nums[k];
                    temp = a + b + c;
                    for (int l = 2; l < temp; l++) {
                        if(temp % l == 0){
                            cnt++;
                            break;
                        }
                    }
                    
                }
            }
            
            answer = allCnt - cnt;
        }
        
       
        
        return answer;
    }
}