public class plusNum {
    public int solution(int n) {
        int answer = 0;
        // n값을 split 함수를 이용해 각가의 값 쪼갠다.
        String[] tmp = Integer.toString(n).split("");
        //반복문을 이용해 tmp에 들어있는 값들을 answer에 더한다.
        for(int i=0; i<tmp.length;i++){
            //string to int
            answer += Integer.parseInt(tmp[i]);
        }
        
        return answer;
    }
}
