import java.util.Scanner;
public class Algorithm_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int order = 0;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                order = i;
            }
        }

        System.out.println(max);
        System.out.println(order+1);
    }
    
}
