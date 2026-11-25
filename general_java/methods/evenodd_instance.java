package general_java.methods;

import java.util.*;

public class evenodd_instance {
    public void evenodd(int number) {
        if (number % 2 == 0) {
            System.out.println("even number");

        }
        else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();

        evenodd_instance obj = new evenodd_instance();
        obj.evenodd(number);




    }
    
}
