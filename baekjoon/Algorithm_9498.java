import java.util.Scanner;
public class Algorithm_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        int grade = sc.nextInt();

        sc.close();

        if(grade >= 90 && grade <= 100)
            answer = "A";
        else if(grade >= 80 && grade <= 89)
            answer = "B";
        else if(grade >= 70 && grade <= 79)
            answer = "C";
        else if(grade >= 60 && grade <= 69)
            answer = "D";
        else 
            answer = "F";
            
        System.out.println(answer);
	}
}
