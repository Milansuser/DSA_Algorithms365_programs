package general_java.methods;

import java.util.*;

public class even_odd_inst_bool {
    public boolean evenodd(int number) {
        if (number % 2 == 0) {
            return true;

        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = sc.nextInt();

        even_odd_inst_bool obj = new even_odd_inst_bool();
        boolean result = obj.evenodd(number);

        if (result) {
            System.out.println("even");

        }
        else {
            System.out.println("odd");
        }
        
        
    }
    
}
