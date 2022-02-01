//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

import java.util.*;

public class Algorithm_1000 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a ; 
			int b ;
			
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}
