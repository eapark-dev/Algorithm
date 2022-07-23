import java.util.Scanner;

public class Algorithm_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();
        String str = "";
        for (int i = 1; i <= len; i++) {
            int a = sc.nextInt();
            if (a < num) {
                str += a + " ";
            }
        }

        System.out.println(str.strip());
    }
}
