import java.util.Stack;

//스캑/큐 이용 올바른 괄호
public class stackCodingTest {
    boolean solution(String s) {
        boolean answer = true;
        // 1. 스택 만들기
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // 2, i 의 값이 ( 일 경우 push
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else { // 아닌 경우 ) 인 지 체크
                if (stack.isEmpty()) { // 값이 없으면 return false;
                    return false;
                } // ( 이미 있으므로 삭제
                stack.pop();
            }
        }

        answer = stack.isEmpty() == true ? true : false;

        return answer;
    }
}