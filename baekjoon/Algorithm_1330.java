import java.util.Scanner;
public class Algorithm_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        String answer = (A>B) ? ">" : (A<B) ? "<" : "==";
        System.out.println(answer);
    }
}
