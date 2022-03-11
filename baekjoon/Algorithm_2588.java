import java.util.Scanner;
public class Algorithm_2588 {
    //(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
    //첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //들어오는 숫자는 세자리 수 자연수 이므로 한자리씩 값을 쪼개어 곱한다.
        String c = Integer.toString(b);

        System.out.println(Integer.parseInt(c.split("")[2])*a);
        System.out.println(Integer.parseInt(c.split("")[1])*a);
        System.out.println(Integer.parseInt(c.split("")[0])*a);
        System.out.println(a*b);
        
    }
}
