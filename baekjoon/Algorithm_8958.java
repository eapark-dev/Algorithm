import java.util.*;

public class Algorithm_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < arr.length; i++) {
            char[] charArr = arr[i].toCharArray();
            int sum = 0;
            int cnt = 1;
            for (int j = 0; j < charArr.length; j++) {
                if ((int) charArr[j] == 79) {
                    sum += cnt;
                    cnt += 1;
                } else {
                    cnt = 1;
                }
            }
            System.out.println(sum);
        }
    }
}
