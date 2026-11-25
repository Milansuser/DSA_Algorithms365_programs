package general_java;
public class narrowing {
    public static void main(String[] args) {
        /*double a = 200;
        int i = (int) d; //Type Casting also Narrowing
        short s = (short) i;
        byte b = (byte)s;
        System.out.println(s);
        */

        //data loss

        int i = 130;
        byte b = (byte) i;
        System.out.println(b);
    }
}
