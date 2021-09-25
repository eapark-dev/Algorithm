public class phoneNumberList {
    class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;
            for(int i=0; i<phone_book.length; i++){
                for(int j=i+1; j<phone_book.length; j++){
                    //startsWith 함수 사용하여 첫번째 값이 접두어인지 확인
                    if(phone_book[i].startsWith(phone_book[j])){
                        answer = false;
                    }
                    if(phone_book[j].startsWith(phone_book[i])){
                        answer = false;
                    }
                }
            }
            return answer;
        }
    }
}
