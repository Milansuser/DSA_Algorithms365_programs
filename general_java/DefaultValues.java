package general_java;

public class DefaultValues {

    static byte a;
    static short b;
    static int c;
    static long d;

    //floating datatypes
    static float f;
    static char ch;
    static boolean bool;
    static double doub;

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        byte value = 127;
        System.out.println(value);
        value++;
        System.out.println(value); // result = -128

    }
}
