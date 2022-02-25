import java.util.Scanner;
public class Algorithm_8393 {
    //백준 알고리즘 : 합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        sc.close();
        int sum = 0;
        for(int i=1; i<=num; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}

