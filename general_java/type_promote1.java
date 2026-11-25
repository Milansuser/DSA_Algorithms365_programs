package general_java;

public class type_promote1 {

    public static void main(String[] args) {

        /*int a = 10;
        byte b = a; // error for int to byte conversion
        System.out.println(b);
         */

 /* int stored in int
        int i = 11;
        int j = i;
        System.out.println(j); // no error
         */

 /* 
        int x = 10;
        byte y = (byte) x;
        System.out.println(y); // no error and no dataloss
         */

 /* 
        int c = 200;
        byte d = (byte) c;
        System.out.println(d); //no error but data loss
         */
        //how long is sotred in float
        long l = 1234567890123456789L;
        float f = l;
        System.out.println("long : " + l);
        System.out.println("float : " + f); //E18 at the last 

        double n = l;
        System.out.println("double : " + n);

    }

}
