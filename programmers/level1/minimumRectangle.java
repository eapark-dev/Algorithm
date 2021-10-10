public class minimumRectangle {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int[] firstMax = new int[sizes.length];
            int[] secMax = new int[sizes.length];
            
            for(int i=0; i<sizes.length; i++){
                for(int j=0; j<sizes[i].length; j++){
                    if(sizes[i][0] > sizes[i][1]){
                        firstMax[i] = sizes[i][0];
                        secMax[i] = sizes[i][1];
                    }else{
                        firstMax[i] = sizes[i][1];
                        secMax[i] = sizes[i][0];
                    }   
                }
            }
            
            int max1 = firstMax[0];
            int max2 = secMax[0];
            for(int i =0; i<firstMax.length; i++){
                if(max1 < firstMax[i]) {
                    max1 = firstMax[i];
                }
                
                if(max2 < secMax[i]) {
                    max2 = secMax[i];
                }
            }
            
            return max1 * max2;
        }
    }
}
