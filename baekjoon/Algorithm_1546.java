import java.util.*;

/*
1. 첫번째로 출력된 수만큼 배열을 선언한다.
2. 선언된 배열과 합산으로 사용할 변수 sum, 평균으로 사용할 변수 avg, 최고 점수를 넣을 max라는 변수를 초기화 한다.
3. 반복문을 통해 출력된 값을 배열에 담는다.
4. 조건문을 이용해 max에 들어갈 값을 비교하여 담는다.
5. 배열에 담은 값을 합산 변수 sum에 더한다.
6. 평균 값을 구하므로 double형으로 변환 시켜 나눈 값을 avg라는 변수에 담는다.
7. 담은 변수에 double형으로 쓴 100.0을 곱해 평균을 구한다.
 */

public class Algorithm_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        double avg = 0.0;
        int sum = 0;
        int max = 0; // 최고 점수 구하기

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
            sum += arr[i];
        }
        sc.close();

        avg = ((double) sum / (double) num) / (double) max;
        System.out.println(avg * 100.0);

    }
}
