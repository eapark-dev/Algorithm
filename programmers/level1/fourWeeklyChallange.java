import java.util.*;
public class fourWeeklyChallange{
    class Solution {
        public String solution(String[] table, String[] languages, int[] preference) {
            //순서가 같을 경우 알파벳 순으로 먼저 리턴 시키기 위해 정렬
            Arrays.sort(table);
            String answer = "";
            String[] tmp = new String[table[0].split(" ").length];
            int[] sum = new int[5];
            //반복문을 이용해 table에 들어있는 값 만큼 반복 
            for(int i=0; i<table.length; i++){
                //테이블 순으로 하나씩 임시 배열 tmp에 담음 
                tmp = table[i].split(" ");
                int cnt = 6; //카운트용 변수
                for(int j=1; j<tmp.length; j++){
                    cnt--; //5,4,3,2,1 순으로 점수 넣기 위해 추가
                    for(int k=0; k<languages.length; k++){
                        if(tmp[j].equals(languages[k])){ //값 비교하여 같으면 cnt와 preference에 있는 값 곱해 합산 변수 sum에 넣음 
                            sum[i] += cnt * preference[k];
                        }
                    }
                }
            }
            //최대 값 구하기
            int max = sum[0];
            int num = 0;
            for(int i=0; i<sum.length; i++){
                if(max < sum[i]){
                    num = i;
                }
            }
            answer = table[num].split(" ")[0]; //최대값에 들어있는 개발자 이름 리턴 
            return answer;
        }
    }

}