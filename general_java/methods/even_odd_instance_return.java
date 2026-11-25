package general_java.methods;

import java.util.*;

public class even_odd_instance_return {
    
    public int evenodd(int number) {
        if (number % 2 == 0) {
            return 0;
        }
        else {
            return 1;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        even_odd_instance_return obj = new even_odd_instance_return();
        int result = obj.evenodd(number);
        
        if (result == 0) {
            System.out.println("even");

        } else {
            System.out.println("odd");
        }



    }
    
}
