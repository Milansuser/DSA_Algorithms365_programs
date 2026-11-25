package Loops;

import java.util.*;

public class sum_natural_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer value: ");
        int var = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= var; i++) {
            sum = sum + i;
            System.out.println(sum);

        }
        System.out.println("the total result is: "+sum);

        
    }
    
}
