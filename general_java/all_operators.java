package general_java;


public class all_operators {

    public static void main(String[] args) {
        
        System.out.println("Relational operators for comparision");
        int e = 20;
        int f = 10;

        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println(e >= f);
        System.out.println(e <= f);
        System.out.println(e == f);
        System.out.println(e != f);
        

        System.out.println("Relational operators for comparision");
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        // compound operators JAVA does automatic typecasting for these operators
        System.out.println("compound operators");
        int h = 10;
        h += 5;
        System.out.println(h);
        h -= 5;
        System.out.println(h);
        h *= 2;
        System.out.println(h);
        h /= 6;
        System.out.println(h);
        h %= 3;
        System.out.println(h);


        //ternary operators
        System.out.println("ternery operators: ");
        int i = 30;
        int j = 40;


        //syntax --> datatype variable_name = (condition check) ? true:false
        int max = (i > j) ? i : j;
        System.out.println(max);


    }
    
}
