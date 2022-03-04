import java.util.Scanner;
public class Algorithm_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j=1; j<=num-i; j++){
                System.err.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
