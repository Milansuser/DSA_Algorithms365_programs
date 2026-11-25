package general_java;
public class bitwise_operator {

    public static void main(String[] args) {
        int x = 10;
        int y = 6;

        System.err.println(" AND : " + (x & y));
        System.err.println(" OR : " + (x | y));
        System.err.println(" XOR : " + (x ^ y));

        System.out.println(~x);// -11
        System.out.println(~y);// -7

        System.err.println("left shift by 1: " + (x << 1));// 20
        System.err.println("left shift by 2: " + (x << 2));// 40
        System.err.println("right shift by 1: " + (x >> 1));// 5
        System.err.println("right shift by 2: " + (x >> 2));//2
        System.err.println();

        System.err.println("signed right shift");
        int z = -10;
        byte b = -10;
        System.err.println("signed right shift: " + (z >> 1));// -5
        System.err.println("signed right shift: " + (z >>> 1));// 2147483643
        System.err.println("unsigned right shift: " + (byte) (b >>> 1)); // provides the GAP as the output 

        System.err.println("unsigned right shift: " + (b >>> 1));
        
        

        
    }
    
}
