import java.util.*;

public class Algorithm_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                arr[j] = tmp;
                sum += tmp;
            }
            double avg = sum / n;
            int cnt = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] > avg) {
                    cnt++;
                }
            }

            double per = ((double) cnt / (double) n) * 100;
            System.out.println(String.format("%.3f", per) + "%");
        }
    }
}
