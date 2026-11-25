package general_java.methods;

public class var_args_overloading {

    static void overloading(int... x) {
        System.out.println("int type");

    }

    static void overloading(double... x) {
        System.out.println("double type");
        
        
    }

    public static void main(String[] args) {
        overloading(10, 20);
        overloading(10, 20, 4.0, 10.1);
    }
}
