public class minimumRectangle {
    class Solution {
        public int solution(int[][] sizes) {
            //가로 길이 구하기
            int[] firstMax = new int[sizes.length];
            //세로 길이 구하기
            int[] secMax = new int[sizes.length];
            
            //가로 세로 값 구하기
            for(int i=0; i<sizes.length; i++){
                for(int j=0; j<sizes[i].length; j++){
                    //가로 세로 중 큰 값 가로 길이에 넣기 
                    //가로 세로 중 작은 값 세로 길이에 넣기
                    if(sizes[i][0] > sizes[i][1]){
                        firstMax[i] = sizes[i][0];
                        secMax[i] = sizes[i][1];
                    }else{
                        firstMax[i] = sizes[i][1];
                        secMax[i] = sizes[i][0];
                    }   
                }
            }
            
            //가로길이 중 최대 값 구하기
            int max1 = firstMax[0];
            //세로길이 중 최대 값 구하기
            int max2 = secMax[0];
            for(int i =0; i<firstMax.length; i++){
                if(max1 < firstMax[i]) {
                    max1 = firstMax[i];
                }
                
                if(max2 < secMax[i]) {
                    max2 = secMax[i];
                }
            }
            
            //가로 * 세로 곱하기
            return max1 * max2;
        }
    }
}
