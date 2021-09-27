import java.util.HashSet;
public class phoneNumberList {
    class Solution {
        public boolean solution(String[] phone_book) {
            //HashSet 사용 
            HashSet<String> set = new HashSet<String>();
            //set에 phone_book 값을 넣음
            for(int i=0; i<phone_book.length; i++){
                set.add(phone_book[i]);
            }
            
            //haspSet에 값이 있는 지 contains 함수 이용하여 비교하여 있으면 false 아니면 true
            for (String key : set)
                for (int i = 1; i <= key.length() - 1; i++) {
                    if (set.contains(key.substring(0, i))) return false;
                }
           return true;
        }
    }
}
