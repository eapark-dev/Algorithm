import java.util.Scanner;

public class Algorithm_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] intArr = new int[num];

        for(int i=0; i<intArr.length; i++){
            int val = sc.nextInt();
            intArr[i] = val;
        }

        int min = intArr[0];
        int max = intArr[0];

        for(int i=0; i<intArr.length;i++){
            if(max < intArr[i]){
                max = intArr[i];
            }

            if(min > intArr[i]){
                min = intArr[i];
            }
        }

        System.out.println(min + " " + max);
    }
    
}
