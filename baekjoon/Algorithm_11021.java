import java.util.Scanner;
public class Algorithm_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        for(int i=1; i<=cnt; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println("Case #"+i+": " +sum);
        }
    }
}
