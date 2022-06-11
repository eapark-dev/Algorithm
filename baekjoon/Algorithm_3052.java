import java.util.*;

public class Algorithm_3052 {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            
            int num = sc.nextInt();
            num = num % 42;
            if(i == 0 ){
                arrList.add(num);
            };
            if(!arrList.contains(num)){
                arrList.add(num);
            };
        };

        in close;
        System.out.println(arrList.size());
    }
}
