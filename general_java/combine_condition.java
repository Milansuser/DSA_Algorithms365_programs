package general_java;
import java.util.*;
public class combine_condition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        System.out.println("enter the percentage");
        double percentage = sc.nextDouble();

        System.out.println("are you medicalfit");
        boolean medicalfit = sc.nextBoolean();

        if (age >= 18 && percentage >= 90 && medicalfit) {
            System.out.println("shortlisted");
        }
        else {
            System.out.println("not eligible for AArmy");
        }

        if (percentage >= 90 || medicalfit) {
            System.out.println("special consideration");
        }
        else {
            System.out.println("not special consideration");
        }

        if (!medicalfit) {
            System.out.println("medically failed");

        }
        else {
            System.out.println("passed");
        }

        if ((percentage >= 90 || age >= 18) && (percentage >= 80 || age >= 17)) {
            System.out.println("eligible");
        }

    }
    
    
}
