package general_java;
import java.util.*;
public class bitwise_by_by2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println("Number is divisible by 2");
        } else {
            System.out.println("Number is not divisible by 2");
        }
    }
    
}
