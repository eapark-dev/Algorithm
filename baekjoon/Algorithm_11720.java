import java.util.Scanner;

public class Algorithm_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 개수
        String a = sc.next(); // 입력 받은 값
        String[] str = a.split("");

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += Integer.parseInt(str[i]);
        }

        System.out.println(sum);

    }
}
