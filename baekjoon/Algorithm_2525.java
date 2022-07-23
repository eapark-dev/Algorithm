import java.util.Scanner;

public class Algorithm_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int addMin = sc.nextInt();

        int sumMin = min + addMin;

        // 60이상인 경우
        if (sumMin >= 60) {
            // 총 값이 60보다 클 경우 60분씩 계속 차감
            while (sumMin >= 60) {
                sumMin -= 60;
                hour += 1;
                // 24를 넘어가면 0으로 초기화
                hour = (hour >= 24) ? 0 : hour;
            }
        }

        System.out.println(hour + " " + sumMin);

    }
}
