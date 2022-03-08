import java.util.Scanner;
public class Algorithm_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();
        int a = Integer.parseInt(value.split(" ")[0]);
        int b = Integer.parseInt(value.split(" ")[1]);
        int c = Integer.parseInt(value.split(" ")[2]);

        sc.close();

        //3숫자가 모두 같을 경우
        if(a == b && b == c)
        {
            System.out.println(10000 + (a*1000));
        }else if(a == b && b != c)
        {
            System.out.println(1000 + (a * 100));   
        }else if(a == c && a != b)
        {
            System.out.println(1000 + (a * 100));   
        }else if(b == c && a != c)
        {
            System.out.println(1000 + (b * 100));   
        }else
        {
            int max;
            if(a >= b && a>=c)
            {
                max = a;
            }else if(b >= a && b >= c)
            {
                max = b;
            }else{
                max = c;
            }
            System.out.println(max * 100);
        }
        
    }
    
}
