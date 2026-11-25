import java.util.*;

public class evenOdd_static_return {

    public static int even(int number) {
        if (number % 2 == 0) {
            return 0;
        }
        else {
            return 1;
        }
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = sc.nextInt();

        int result = even(number);
        System.out.println(result);

        if (result == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
        
    }
    
}
