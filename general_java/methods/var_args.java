package general_java.methods;

public class var_args {

    static void show(int... x) {
        System.out.println("count: " + x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " ");
        }
        System.out.println();

        
    }

    public static void main(String[] args) {
        show();
        show(10, 20);
        show(10, 20, 30);
        show(10, 20, 30, 40);
    }
}
