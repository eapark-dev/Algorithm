import java.util.Scanner;
public class Algorithm_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = Integer.toString(b);

        System.out.println(Integer.parseInt(c.split("")[2])*a);
        System.out.println(Integer.parseInt(c.split("")[1])*a);
        System.out.println(Integer.parseInt(c.split("")[0])*a);
        System.out.println(a*b);
        
    }
}
