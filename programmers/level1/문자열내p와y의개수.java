public class 문자열내p와y의개수 {
    class Solution {
        boolean solution(String s) {
            boolean answer = false;
            String[] str = s.toUpperCase().split("");
            int pnum = 0;
            int ynum = 0;
            
            for(int i =0; i<str.length; i++)
            {
                if(str[i].equals("P")){
                    pnum++;
                }
                if(str[i].equals("Y")){
                    ynum++;
                }
            }
            
            if(pnum == ynum){
                answer = true;
            }
            
            return answer;
        }
    }
}
