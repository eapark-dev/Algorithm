import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String tmp = "";
        for(int i=1; i<a+1;i++ ){
            tmp += "*";
        }
        for(int j=1; j<b+1; j++){
            System.out.println(tmp);
        }
  
    }
}