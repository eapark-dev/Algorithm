import java.util.Scanner;
public class Algorithm_2884 {
    //백준 알고리즘 : 알람시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt(); //시간
        int min = sc.nextInt(); //분
        sc.close();

        if(min < 45)
        {
            hour--;
            min = (min + 60) - 45;
            if(hour < 0)
            {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        }else{
            System.out.println(hour + " " + (min  - 45));
        }
    }
}

