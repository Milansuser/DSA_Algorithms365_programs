package general_java;
import java.util.*;

public class nested_if_else_if {
    public static void main(String[] agrs) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age :");
        int age = sc.nextInt();

        System.out.println("enter the percentage: ");
        int percentage = sc.nextInt();

        if(age>= 18){

            if (percentage >= 90) {
                System.out.println("greater than 90");
            } else if (percentage >= 80) {
                System.out.println("greater than 80");
            } else if (percentage >= 70) {
                System.out.println("greater than 70");
            }

        }else{
            System.out.println("not eligible");
        }



    }

    
}
