package general_java.methods;

//pass different datatype together using objects

public class var_args_object {

    static void show(Object... obj) 
    {
        for (Object m : obj) {
            System.out.println(m);
        }
        
    }

    public static void main(String[] args) {
        show(101, "kethu", 99.9, true, "k");
    }
    
}
