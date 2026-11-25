package general_java.methods;

public class method_in_method {

    public static void greet() {
        System.out.println("greet method");
    }

    public static void welcome() {
        System.out.println("welcome method");
        greet();
        System.out.println("welcome method ends");
    }

    public static void main(String[] args) {

        
        welcome();
        
    }
    
}
