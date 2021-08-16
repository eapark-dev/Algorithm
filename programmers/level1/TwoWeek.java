public class TwoWeek{
    class Solution {
        public String solution(int[][] scores) {
            String answer = "";
            int[] arr = new int[scores.length];
            for(int i=0; i<scores.length; i++){
                int tmp = scores[i][i];
                int cnt = 0;
                for(int j=0; j<scores.length; j++){
                    arr[j] = scores[j][i];
                    if(tmp == scores[j][i]){ 
                        cnt++;
                    }
                }
                answer += getAvg(i,arr,cnt);
    
            }
            return answer;
        }
        
        //평균 점수 구하는 함수
        private String getAvg(int tmp, int[] arr, int cnt ){
            int avg = 0;
            int sum = 0;
            if(cnt == 1){
                int max = arr[0]; //최대값 
                int min = arr[0]; //최소값
                for(int i=0; i<arr.length; i++){
                    if(max < arr[i]){
                        max = arr[i];
                    }
                    
                    if(min > arr[i]){
                        min = arr[i];
                    }
                }   
                for(int i=0; i<arr.length; i++){ 
                    if(arr[tmp] != max && arr[tmp] != min){
                        sum += arr[i];
                        avg++;
                    }else if(arr[tmp] < arr[i]){
                        sum += arr[i];
                        avg++;
                    }else if(arr[tmp] > arr[i]){
                        sum += arr[i];
                        avg++;
                    }
                }
            }
            else{
                for(int i=0; i<arr.length; i++){
                    sum += arr[i];
                    avg++;
                }
            }
            return score(avg, sum);
        }
        
        //등급 구하는 함수
        private String score(int avg , int sum){
            int total = sum / avg;
            String title = "";
            if(total >= 90) {
                title = "A";
            }else if(total >= 80 && total < 90){
                title = "B";
            }else if(total >= 70 && total < 80){
                title = "C";  
            }else if(total >= 50 && total < 70){
                title = "D";     
            }else{
                title = "F";
            }
            return title;
        }
    }
}