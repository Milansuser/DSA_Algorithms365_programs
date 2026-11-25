package general_java.methods;

public class max_of_three {

    public static void max_three(int a, int b, int c) {

        if (a > b) {
            System.out.println(a+" is greater");
        } else if (b > c) {
            System.out.println(b + " is greater");
        }
        else
        {
            System.out.println(c+" is greater");
        }

    }

    public static void main(String[] args) {

        max_three(10, 20, 60);
        
        
    }
    
}
