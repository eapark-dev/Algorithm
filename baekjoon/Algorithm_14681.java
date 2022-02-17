import java.util.Scanner;
public class Algorithm_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();
        if(x > 0) {
            if(y > 0) {
                answer = 1; 
            }else{
                answer = 4;
            }
        }else {
            if(y > 0) {
                answer = 2; 
            }else{
                answer = 3;
            }
        }

        System.out.println(answer);
    }
}
