package general_java.methods;

public class salary {

    public static void salary_method() {
        System.out.println("salary method");
    }

    public static void HRA() {
        System.out.println("HRA Method");
    }

    public static void TA() {
        System.out.println("TC method");
    }

    public static void DA(){
        System.out.println("DA Method");
    }

    public static void main(String[] args) {

        salary obj = new salary();
        obj.salary_method();
        obj.TA();
        obj.DA();
        obj.HRA();
        
        
    }
    
}
