package general_java;

public class swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        System.out.println("    ");
        System.out.println("Before swapping of two numbers: " + a + " " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping " + a + " " + b);

    }
}
