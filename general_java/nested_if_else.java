package general_java;
public class nested_if_else {

    public static void main(String[] args) {
        int age = 20;
        boolean medicalFit = true;
        int height = 10;

        if (age >= 18) {
            if (height >= 170) {
                if (medicalFit) {
                    System.out.println("Selected");
                } else {
                    System.out.println("not fit");
                }
            } else {
                System.out.println("height is not matched");
            }
        }
        else {
            System.out.println("age is not elagible");
        }
    }
    
}
