import java.util.Scanner;

public class Algorithm_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            String star = "*";
            int j = 1;
            while (j <= i) {
                star += "*";
                j++;
            }
            System.out.println(star);
        }
    }
}
