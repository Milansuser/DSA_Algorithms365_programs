package general_java.methods;

import java.util.*;

public class evenOdd {

    public static void check(int number) {
        if (number % 2 == 0) {
            System.out.println("even number");
        }
        else {
            System.out.println("Odd number");
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check the even or odd: ");
        int number = sc.nextInt();
        
        check(number);

        
    }
    
}
