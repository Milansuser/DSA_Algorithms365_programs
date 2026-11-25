public class swap_Without_temp {

    public static void main(String[] args) {

        //using addition and subtraction
        int a = 10, b = 20;

        /*System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;   // a = 30
        b = a - b;   // b = 10
        a = a - b;   // a = 20

        System.out.println("After swap:  a = " + a + ", b = " + b);
        */

        System.out.println("\n");

        //using XOR operation
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap:  a = " + a + ", b = " + b);

        System.out.println("\n");
        //using multiplication and division
        a = a * b;   // a = 200
        b = a / b;   // b = 10
        a = a / b;   // a = 20

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    
}
