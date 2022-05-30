import java.util.Scanner;

public class Algorithm_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int total = a * b * c;

        String[] tot = Integer.toString(total).split("");
        int cnt = 0; 

        for(int i=0; i<10; i++){
            for(int j=0; j<tot.length; j++){
                if(i == Integer.parseInt(tot[j])){
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}