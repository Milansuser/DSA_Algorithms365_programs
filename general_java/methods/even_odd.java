package general_java.methods;

public class even_odd {

    public static void even_odd_val(int a) {
        if (a % 2 == 0) 
        {
            System.out.println("it is even");
        }
        else 
        {
            System.out.println("it is odd");
        }
    }

    public static void main(String[] args) {
        even_odd_val(7);
    }
    
}
